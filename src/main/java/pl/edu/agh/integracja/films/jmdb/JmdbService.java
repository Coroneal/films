package pl.edu.agh.integracja.films.jmdb;

import static pl.edu.agh.integracja.films.jmdb.db.tables.Movies.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Ratings.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jooq.types.UInteger;

import pl.edu.agh.integracja.films.jmdb.db.tables.pojos.Movies;
import pl.edu.agh.integracja.films.utils.MySqlService;

public class JmdbService extends MySqlService {

	public JmdbService() {
		super("jdbc:mysql://localhost/jmdb", "jmdb", "jmdb");
	}

	public List<Movies> getMovies(int minNumberOfVotes) throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			return getContext(connection)
					.select(MOVIES.MOVIEID, MOVIES.TITLE, MOVIES.YEAR, MOVIES.IMDBID)
					.from(MOVIES
									.join(RATINGS)
									.on(MOVIES.MOVIEID.eq(RATINGS.MOVIEID))
					).where(RATINGS.VOTES.greaterOrEqual(UInteger.valueOf(minNumberOfVotes)))
					.and(MOVIES.TITLE.notLike("\"%"))
					.fetchInto(Movies.class);
		}
	}

}
