package pl.edu.agh.integracja.films.jmdb;

import static pl.edu.agh.integracja.films.jmdb.db.tables.Actors.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Movies.*;
import static pl.edu.agh.integracja.films.jmdb.db.tables.Movies2actors.*;
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

	public Map<Actor, ActorMovie> getActors(int movieId) throws SQLException {
		try (Connection connection = cpds.getConnection()) {
			return getContext(connection)
					.selectFrom(ACTORS
									.join(MOVIES2ACTORS)
									.on(ACTORS.ACTORID.eq(MOVIES2ACTORS.ACTORID))
					).where(MOVIES2ACTORS.MOVIEID.equal(UInteger.valueOf(movieId)))
					.fetch()
					.stream()
					.collect(Collectors.toMap(
							this::recordToActor,
							this::recordToActorMovie
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

}
