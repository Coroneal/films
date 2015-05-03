package pl.edu.agh.integracja.films;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.omertron.themoviedbapi.MovieDbException;

import pl.edu.agh.integracja.films.films.FilmsService;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Actor;
import pl.edu.agh.integracja.films.films.db.tables.pojos.ActorMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Director;
import pl.edu.agh.integracja.films.films.db.tables.pojos.DirectorMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.GenreMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;
import pl.edu.agh.integracja.films.jmdb.JmdbService;
import pl.edu.agh.integracja.films.jmdb.db.tables.pojos.Movies;
import pl.edu.agh.integracja.films.themoviedb.TheMovieDbService;
import pl.edu.agh.integracja.films.utils.FilmsUtils;
import pl.edu.agh.integracja.films.utils.JmdbUtils;

public class Main {

	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {
		long time = System.currentTimeMillis();
		new Main().main(1500);
		time = (System.currentTimeMillis() - time) / 1000;
		System.out.println(String.format("Finished. Time elapsed: %sm %ss", time / 60, time % 60));
	}

	private JmdbService jmdbService = new JmdbService();
	private TheMovieDbService tmdbService = new TheMovieDbService();
	private FilmsService filmsService = new FilmsService();

	private Map<String, Genre> initGenres() throws SQLException, MovieDbException {
		filmsService.putGenres(tmdbService.getGenres());
		return FilmsUtils.genreMap(filmsService.getGenres());
	}

	private Movie putMovie(Movies jmdbMovie) throws MovieDbException, ParseException, SQLException {
		String title = JmdbUtils.getTitle(jmdbMovie);

		Pair<Movie, List<Integer>> movieAndGenes = tmdbService.getMovie(title, jmdbMovie.getYear());
		Movie movie = movieAndGenes.getLeft();

		movie.setJmdbid(jmdbMovie.getMovieid().longValue());
		Movie savedMovie = filmsService.putMovie(movie);

		List<GenreMovie> genreMovies = movieAndGenes.getRight()
				.stream()
				.map(genreId -> new GenreMovie(null, savedMovie.getId(), genreId))
				.collect(Collectors.toList());
		filmsService.putGenreMovies(genreMovies);

		return savedMovie;
	}

	private void putActors(Movie movie, Map<Long, Pair<Actor, ActorMovie>> actorsMap) throws SQLException {
		List<Actor> actors = filmsService
				.putActors(actorsMap.values().stream().map(Pair::getLeft).collect(Collectors.toList()));

		List<ActorMovie> actorMovieList = new ArrayList<>();
		for (Actor actor : actors) {
			ActorMovie actorMovie = actorsMap.get(actor.getJmdbid()).getRight();
			actorMovie.setActorId(actor.getId());
			actorMovie.setMovieId(movie.getId());
			actorMovieList.add(actorMovie);
		}
		filmsService.putActorMovies(actorMovieList);
	}

	private void putDirectors(Movie movie, Map<Long, Pair<Director, DirectorMovie>> directorsMap) throws SQLException {
		List<Director> directors = filmsService
				.putDirectors(directorsMap.values().stream().map(Pair::getLeft).collect(Collectors.toList()));

		List<DirectorMovie> directorMovieList = new ArrayList<>();
		for (Director director : directors) {
			DirectorMovie directorMovie = directorsMap.get(director.getJmdbid()).getRight();
			directorMovie.setDirectorId(director.getId());
			directorMovie.setMovieId(movie.getId());
			directorMovieList.add(directorMovie);
		}
		filmsService.putDirectorMovies(directorMovieList);
	}

	private void main(int minNumberOfVotes) throws MovieDbException, SQLException {
		initGenres();
		tmdbService.init();

		List<Movies> movies = jmdbService.getMovies(minNumberOfVotes);
		for (Movies jmdbMovie : movies) {
			Movie movie;
			try {
				movie = putMovie(jmdbMovie);
			} catch (MovieDbException | ParseException e) {
				continue;
			}

			Map<Long, Pair<Actor, ActorMovie>> actorsMap = jmdbService.getActors(movie.getJmdbid().intValue());
			putActors(movie, actorsMap);

			Map<Long, Pair<Director, DirectorMovie>> directorsMap = jmdbService.getDirectors(movie.getJmdbid().intValue());
			putDirectors(movie, directorsMap);
		}
	}

}
