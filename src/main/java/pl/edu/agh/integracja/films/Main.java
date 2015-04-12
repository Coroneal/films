package pl.edu.agh.integracja.films;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import pl.edu.agh.integracja.films.films.FilmsService;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;
import pl.edu.agh.integracja.films.jmdb.JmdbService;
import pl.edu.agh.integracja.films.jmdb.db.tables.pojos.Movies;
import pl.edu.agh.integracja.films.themoviedb.TheMovieDbService;
import pl.edu.agh.integracja.films.utils.FilmsUtils;
import pl.edu.agh.integracja.films.utils.JmdbUtils;

public class Main {

	public static void main(String[] args) throws SQLException {
		JmdbService jmdbService = new JmdbService();
		TheMovieDbService tmdbService = new TheMovieDbService();
		FilmsService filmsService = new FilmsService();

		filmsService.insertGenres(tmdbService.getGenres());
		Map<String, Genre> genres = FilmsUtils.genreMap(filmsService.getGenres());

		List<Movies> movies = jmdbService.getMovies(1500);
		for (Movies movie : movies) {
			String title = JmdbUtils.getTitle(movie);

			Movie tmdbMovie = tmdbService.getMovie(title, movie.getYear());
		}
	}

}
