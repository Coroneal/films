package pl.edu.agh.integracja.films.utils;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import pl.edu.agh.integracja.films.films.db.tables.pojos.Actor;
import pl.edu.agh.integracja.films.films.db.tables.pojos.ActorMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Director;
import pl.edu.agh.integracja.films.films.db.tables.pojos.DirectorMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;

public class FilmsUtils {

	public static Map<String, Genre> genreMap(List<Genre> genres) {
		return genres.stream()
				.collect(Collectors.toMap(
						Genre::getName,
						genre -> genre
				));
	}

	public static List<Object[]> createGenreValues(Collection<Genre> genres) {
		return genres.stream()
				.map(FilmsUtils::createValues)
				.collect(Collectors.toList());
	}

	public static List<Object[]> createMovieValues(Collection<Movie> movies) {
		return movies.stream()
				.map(FilmsUtils::createValues)
				.collect(Collectors.toList());
	}

	public static List<Object[]> createActorValues(Collection<Actor> actors) {
		return actors.stream()
				.map(FilmsUtils::createValues)
				.collect(Collectors.toList());
	}

	public static List<Object[]> createDirectorValues(Collection<Director> directors) {
		return directors.stream()
				.map(FilmsUtils::createValues)
				.collect(Collectors.toList());
	}

	public static List<Object[]> createActorMovieValues(Collection<ActorMovie> actorMovies) {
		return actorMovies.stream()
				.map(FilmsUtils::createValues)
				.collect(Collectors.toList());
	}

	public static List<Object[]> createDirectorMovieValues(Collection<DirectorMovie> directorMovies) {
		return directorMovies.stream()
				.map(FilmsUtils::createValues)
				.collect(Collectors.toList());
	}

	public static Object[] createValues(Movie movie) {
		return new Object[] {
				movie.getId(),
				movie.getTitle(),
				movie.getLanguage(),
				movie.getReleaseDate(),
				movie.getBudget(),
				movie.getRevenue(),
				movie.getPopularity(),
				movie.getVoteCount(),
				movie.getVoteAverage(),
				movie.getGenreId(),
				movie.getJmdbid()
		};
	}

	public static Object[] createValues(Genre genre) {
		return new Object[] {
				genre.getId(),
				genre.getName()
		};
	}

	public static Object[] createValues(Actor actor) {
		return new Object[] {
				actor.getId(),
				actor.getName(),
				actor.getSurname(),
				actor.getSex(),
				actor.getJmdbid()
		};
	}

	public static Object[] createValues(Director director) {
		return new Object[] {
				director.getId(),
				director.getName(),
				director.getSurname(),
				director.getJmdbid()
		};
	}

	public static Object[] createValues(ActorMovie actorMovie) {
		return new Object[] {
				actorMovie.getId(),
				actorMovie.getMovieId(),
				actorMovie.getActorId(),
				actorMovie.getRole(),
				actorMovie.getMainRole()
		};
	}

	public static Object[] createValues(DirectorMovie directorMovie) {
		return new Object[] {
				directorMovie.getId(),
				directorMovie.getMovieId(),
				directorMovie.getDirectorId()
		};
	}
}
