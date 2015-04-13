package pl.edu.agh.integracja.films.jmdb;

import static pl.edu.agh.integracja.films.jmdb.db.tables.Actors.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Directors.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Movies.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Movies2actors.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Movies2directors.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Ratings.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Pair;
import org.jooq.Record;
import org.jooq.types.UInteger;

import pl.edu.agh.integracja.films.films.db.tables.pojos.Actor;
import pl.edu.agh.integracja.films.films.db.tables.pojos.ActorMovie;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Director;
import pl.edu.agh.integracja.films.films.db.tables.pojos.DirectorMovie;
import pl.edu.agh.integracja.films.jmdb.db.tables.pojos.Movies;
import pl.edu.agh.integracja.films.utils.JmdbUtils;
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

	public Map<Long, Pair<Actor, ActorMovie>> getActors(long movieId) throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			return getContext(connection)
					.selectFrom(ACTORS
									.join(MOVIES2ACTORS)
									.on(ACTORS.ACTORID.eq(MOVIES2ACTORS.ACTORID))
					).where(MOVIES2ACTORS.MOVIEID.equal(UInteger.valueOf(movieId)))
					.fetch()
					.stream()
					.collect(Collectors.toMap(
							record -> record.getValue(ACTORS.ACTORID).longValue(),
							record -> Pair.of(recordToActor(record), recordToActorMovie(record))
					));
		}
	}

	private Actor recordToActor(Record record) {
		Pair<String, String> name = JmdbUtils.getFirstLastName(record.getValue(ACTORS.NAME));
		return new Actor(
				null,
				name.getLeft(),
				name.getRight(),
				record.getValue(ACTORS.SEX).getLiteral(),
				record.getValue(ACTORS.ACTORID).longValue()
		);
	}

	private ActorMovie recordToActorMovie(Record record) {
		return new ActorMovie(
				null,
				null,
				null,
				record.getValue(MOVIES2ACTORS.AS_CHARACTER),
				null
		);
	}

	public Map<Long, Pair<Director, DirectorMovie>> getDirectors(long movieId) throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			return getContext(connection)
					.selectDistinct(DIRECTORS.fields())
					.from(DIRECTORS
									.join(MOVIES2DIRECTORS)
									.on(DIRECTORS.DIRECTORID.eq(MOVIES2DIRECTORS.DIRECTORID))
					).where(MOVIES2DIRECTORS.MOVIEID.equal(UInteger.valueOf(movieId)))
					.fetch()
					.stream()
					.collect(Collectors.toMap(
							record -> record.getValue(DIRECTORS.DIRECTORID).longValue(),
							record -> Pair.of(recordToDirector(record), new DirectorMovie(null, null, null))
					));
		}
	}

	private Director recordToDirector(Record record) {
		Pair<String, String> name = JmdbUtils.getFirstLastName(record.getValue(DIRECTORS.NAME));
		return new Director(
				null,
				name.getLeft(),
				name.getRight(),
				record.getValue(DIRECTORS.DIRECTORID).longValue()
		);
	}

}
