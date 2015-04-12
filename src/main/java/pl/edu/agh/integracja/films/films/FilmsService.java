package pl.edu.agh.integracja.films.films;

import static pl.edu.agh.integracja.films.films.db.tables.Actor.*;
import static pl.edu.agh.integracja.films.films.db.tables.Director.*;
import static pl.edu.agh.integracja.films.films.db.tables.Genre.*;
import static pl.edu.agh.integracja.films.films.db.tables.Movie.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import pl.edu.agh.integracja.films.films.db.tables.pojos.Actor;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Director;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;
import pl.edu.agh.integracja.films.films.db.tables.records.ActorRecord;
import pl.edu.agh.integracja.films.films.db.tables.records.DirectorRecord;
import pl.edu.agh.integracja.films.utils.MySqlService;

public class FilmsService extends MySqlService {

	public FilmsService() {
		super("jdbc:mysql://localhost/films", "films", "films");
	}

	public void insertGenres(List<Genre> genres) throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			getContext(connection)
					.insertInto(GENRE)
					.values(genres)
					.execute();
		}
	}

	public List<Genre> getGenres() throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			return getContext(connection)
					.selectFrom(GENRE)
					.fetchInto(Genre.class);
		}
	}

	public Movie putMovie(Movie movie) throws SQLException {
		return put(Movie.class, movie, MOVIE);
	}

	public List<Actor> putActors(Collection<Actor> actors) throws SQLException {
		return putAll(Actor.class, ActorRecord.class, actors, ACTOR);
	}

	public List<Director> putDirector(Collection<Director> directors) throws SQLException {
		return putAll(Director.class, DirectorRecord.class, directors, DIRECTOR);
	}

}

