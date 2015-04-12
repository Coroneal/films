package pl.edu.agh.integracja.films.jmdb;

import static pl.edu.agh.integracja.films.jmdb.db.tables.Movies.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Ratings.*;

import java.beans.PropertyVetoException;
import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.types.UInteger;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import pl.edu.agh.integracja.films.jmdb.db.tables.pojos.Movies;

public class JmdbService implements Closeable {

	private final ComboPooledDataSource cpds;

	public static void main(String[] args) throws SQLException {
		new JmdbService().getMovies();
	}

	public JmdbService() {
		try {
			cpds = new ComboPooledDataSource();
			cpds.setDriverClass("com.mysql.jdbc.Driver");
			cpds.setJdbcUrl("jdbc:mysql://localhost/jmdb");
			cpds.setUser("jmdb");
			cpds.setPassword("jmdb");
		} catch (PropertyVetoException e) {
			throw new IllegalStateException(e);
		}
	}

	public List<Movies> getMovies() throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			DSLContext create = DSL.using(connection, SQLDialect.MYSQL);

			return create.select(MOVIES.MOVIEID, MOVIES.TITLE, MOVIES.YEAR, MOVIES.IMDBID)
					.from(MOVIES
									.join(RATINGS)
									.on(MOVIES.MOVIEID.eq(RATINGS.MOVIEID))
					).where(RATINGS.VOTES.greaterOrEqual(UInteger.valueOf(1500)))
					.and(MOVIES.TITLE.notLike("\"%"))
					.fetchInto(Movies.class);
		}
	}

	@Override
	public void close() throws IOException {
		cpds.close();
	}

}
