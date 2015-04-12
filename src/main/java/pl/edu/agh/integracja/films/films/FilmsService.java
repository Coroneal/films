package pl.edu.agh.integracja.films.films;

import static pl.edu.agh.integracja.films.films.db.tables.Genre.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
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

}

