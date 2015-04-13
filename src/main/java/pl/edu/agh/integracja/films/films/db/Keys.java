/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.integracja.films.films.db;

/**
 * A class modelling foreign key relationships between tables of the <code>films</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.ActorRecord, java.lang.Integer> IDENTITY_ACTOR = Identities0.IDENTITY_ACTOR;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.ActorMovieRecord, java.lang.Integer> IDENTITY_ACTOR_MOVIE = Identities0.IDENTITY_ACTOR_MOVIE;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.DirectorRecord, java.lang.Integer> IDENTITY_DIRECTOR = Identities0.IDENTITY_DIRECTOR;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.DirectorMovieRecord, java.lang.Integer> IDENTITY_DIRECTOR_MOVIE = Identities0.IDENTITY_DIRECTOR_MOVIE;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.GenreRecord, java.lang.Integer> IDENTITY_GENRE = Identities0.IDENTITY_GENRE;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.MovieRecord, java.lang.Integer> IDENTITY_MOVIE = Identities0.IDENTITY_MOVIE;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.ActorRecord> KEY_ACTOR_PRIMARY = UniqueKeys0.KEY_ACTOR_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.ActorMovieRecord> KEY_ACTOR_MOVIE_PRIMARY = UniqueKeys0.KEY_ACTOR_MOVIE_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.DirectorRecord> KEY_DIRECTOR_PRIMARY = UniqueKeys0.KEY_DIRECTOR_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.DirectorMovieRecord> KEY_DIRECTOR_MOVIE_PRIMARY = UniqueKeys0.KEY_DIRECTOR_MOVIE_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.GenreRecord> KEY_GENRE_PRIMARY = UniqueKeys0.KEY_GENRE_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.MovieRecord> KEY_MOVIE_PRIMARY = UniqueKeys0.KEY_MOVIE_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.ActorRecord, java.lang.Integer> IDENTITY_ACTOR = createIdentity(pl.edu.agh.integracja.films.films.db.tables.Actor.ACTOR, pl.edu.agh.integracja.films.films.db.tables.Actor.ACTOR.ID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.ActorMovieRecord, java.lang.Integer> IDENTITY_ACTOR_MOVIE = createIdentity(pl.edu.agh.integracja.films.films.db.tables.ActorMovie.ACTOR_MOVIE, pl.edu.agh.integracja.films.films.db.tables.ActorMovie.ACTOR_MOVIE.ID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.DirectorRecord, java.lang.Integer> IDENTITY_DIRECTOR = createIdentity(pl.edu.agh.integracja.films.films.db.tables.Director.DIRECTOR, pl.edu.agh.integracja.films.films.db.tables.Director.DIRECTOR.ID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.DirectorMovieRecord, java.lang.Integer> IDENTITY_DIRECTOR_MOVIE = createIdentity(pl.edu.agh.integracja.films.films.db.tables.DirectorMovie.DIRECTOR_MOVIE, pl.edu.agh.integracja.films.films.db.tables.DirectorMovie.DIRECTOR_MOVIE.ID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.GenreRecord, java.lang.Integer> IDENTITY_GENRE = createIdentity(pl.edu.agh.integracja.films.films.db.tables.Genre.GENRE, pl.edu.agh.integracja.films.films.db.tables.Genre.GENRE.ID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.films.db.tables.records.MovieRecord, java.lang.Integer> IDENTITY_MOVIE = createIdentity(pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE, pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.ActorRecord> KEY_ACTOR_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.films.db.tables.Actor.ACTOR, pl.edu.agh.integracja.films.films.db.tables.Actor.ACTOR.ID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.ActorMovieRecord> KEY_ACTOR_MOVIE_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.films.db.tables.ActorMovie.ACTOR_MOVIE, pl.edu.agh.integracja.films.films.db.tables.ActorMovie.ACTOR_MOVIE.ID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.DirectorRecord> KEY_DIRECTOR_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.films.db.tables.Director.DIRECTOR, pl.edu.agh.integracja.films.films.db.tables.Director.DIRECTOR.ID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.DirectorMovieRecord> KEY_DIRECTOR_MOVIE_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.films.db.tables.DirectorMovie.DIRECTOR_MOVIE, pl.edu.agh.integracja.films.films.db.tables.DirectorMovie.DIRECTOR_MOVIE.ID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.GenreRecord> KEY_GENRE_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.films.db.tables.Genre.GENRE, pl.edu.agh.integracja.films.films.db.tables.Genre.GENRE.ID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.films.db.tables.records.MovieRecord> KEY_MOVIE_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE, pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.ID);
	}
}
