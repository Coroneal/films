package pl.edu.agh.integracja.films.films;

import static pl.edu.agh.integracja.films.films.db.tables.Actor.*;
import static pl.edu.agh.integracja.films.films.db.tables.ActorMovie.*;
import static pl.edu.agh.integracja.films.films.db.tables.Director.*;
import static pl.edu.agh.integracja.films.films.db.tables.DirectorMovie.*;
import static pl.edu.agh.integracja.films.films.db.tables.Genre.*;
import static pl.edu.agh.integracja.films.films.db.tables.GenreMovie.*;
import static pl.edu.agh.integracja.films.films.db.tables.Movie.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.ListUtils;

import pl.edu.agh.integracja.films.films.db.tables.pojos.Actor;
import pl.edu.agh.integracja.films.films.db.tables.pojos.ActorMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Director;
import pl.edu.agh.integracja.films.films.db.tables.pojos.DirectorMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.GenreMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;
import pl.edu.agh.integracja.films.utils.FilmsUtils;
import pl.edu.agh.integracja.films.utils.MySqlService;

public class FilmsService extends MySqlService {

	public FilmsService() {
		super("jdbc:mysql://localhost/films", "films", "films");
	}

	public List<Genre> getGenres() throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			return getContext(connection)
					.selectFrom(GENRE)
					.fetchInto(Genre.class);
		}
	}

	public Movie putMovie(Movie movie) throws SQLException {
		return put(Movie.class, FilmsUtils.createValues(movie), MOVIE);
	}

	public List<Genre> putGenres(Collection<Genre> genres) throws SQLException {
		return putAll(Genre.class, FilmsUtils.createGenreValues(genres), GENRE);
	}

	public List<Actor> putActors(Collection<Actor> actors) throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			List<Actor> existingActors = getContext(connection)
					.selectFrom(ACTOR)
					.where(ACTOR.JMDBID.in(actors.stream().map(Actor::getJmdbid).collect(Collectors.toList())))
					.fetchInto(Actor.class);

			actors.removeAll(existingActors);
			List<Actor> newActors = putAll(Actor.class, FilmsUtils.createActorValues(actors), ACTOR);
			return ListUtils.union(existingActors, newActors);
		}
	}

	public List<ActorMovie> putActorMovies(Collection<ActorMovie> actorMovies) throws SQLException {
		return putAll(ActorMovie.class, FilmsUtils.createActorMovieValues(actorMovies), ACTOR_MOVIE);
	}

	public List<Director> putDirectors(Collection<Director> directors) throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			List<Director> existingDirectors = getContext(connection)
					.selectFrom(DIRECTOR)
					.where(DIRECTOR.JMDBID.in(directors.stream().map(Director::getJmdbid).collect(Collectors.toList())))
					.fetchInto(Director.class);

			directors.removeAll(existingDirectors);
			List<Director> newDirectors = putAll(Director.class, FilmsUtils.createDirectorValues(directors), DIRECTOR);
			return ListUtils.union(existingDirectors, newDirectors);
		}
	}

	public List<DirectorMovie> putDirectorMovies(Collection<DirectorMovie> directorMovies) throws SQLException {
		return putAll(DirectorMovie.class, FilmsUtils.createDirectorMovieValues(directorMovies), DIRECTOR_MOVIE);
	}

	public List<GenreMovie> putGenreMovies(Collection<GenreMovie> genreMovies) throws SQLException {
		return putAll(GenreMovie.class, FilmsUtils.createGenreMovieValues(genreMovies), GENRE_MOVIE);
	}

}

