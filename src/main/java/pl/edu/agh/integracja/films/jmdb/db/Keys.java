/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.integracja.films.jmdb.db;

/**
 * A class modelling foreign key relationships between tables of the <code>jmdb</code> 
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

	public static final org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.ActorsRecord, org.jooq.types.UInteger> IDENTITY_ACTORS = Identities0.IDENTITY_ACTORS;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.ComposersRecord, org.jooq.types.UInteger> IDENTITY_COMPOSERS = Identities0.IDENTITY_COMPOSERS;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.DirectorsRecord, org.jooq.types.UInteger> IDENTITY_DIRECTORS = Identities0.IDENTITY_DIRECTORS;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.EditorsRecord, org.jooq.types.UInteger> IDENTITY_EDITORS = Identities0.IDENTITY_EDITORS;
	public static final org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.MoviesRecord, org.jooq.types.UInteger> IDENTITY_MOVIES = Identities0.IDENTITY_MOVIES;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.ActorsRecord> KEY_ACTORS_PRIMARY = UniqueKeys0.KEY_ACTORS_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.BusinessRecord> KEY_BUSINESS_PRIMARY = UniqueKeys0.KEY_BUSINESS_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.ComposersRecord> KEY_COMPOSERS_PRIMARY = UniqueKeys0.KEY_COMPOSERS_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.DirectorsRecord> KEY_DIRECTORS_PRIMARY = UniqueKeys0.KEY_DIRECTORS_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.EditorsRecord> KEY_EDITORS_PRIMARY = UniqueKeys0.KEY_EDITORS_PRIMARY;
	public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.MoviesRecord> KEY_MOVIES_PRIMARY = UniqueKeys0.KEY_MOVIES_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.ActorsRecord, org.jooq.types.UInteger> IDENTITY_ACTORS = createIdentity(pl.edu.agh.integracja.films.jmdb.db.tables.Actors.ACTORS, pl.edu.agh.integracja.films.jmdb.db.tables.Actors.ACTORS.ACTORID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.ComposersRecord, org.jooq.types.UInteger> IDENTITY_COMPOSERS = createIdentity(pl.edu.agh.integracja.films.jmdb.db.tables.Composers.COMPOSERS, pl.edu.agh.integracja.films.jmdb.db.tables.Composers.COMPOSERS.COMPOSERID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.DirectorsRecord, org.jooq.types.UInteger> IDENTITY_DIRECTORS = createIdentity(pl.edu.agh.integracja.films.jmdb.db.tables.Directors.DIRECTORS, pl.edu.agh.integracja.films.jmdb.db.tables.Directors.DIRECTORS.DIRECTORID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.EditorsRecord, org.jooq.types.UInteger> IDENTITY_EDITORS = createIdentity(pl.edu.agh.integracja.films.jmdb.db.tables.Editors.EDITORS, pl.edu.agh.integracja.films.jmdb.db.tables.Editors.EDITORS.EDITORID);
		public static org.jooq.Identity<pl.edu.agh.integracja.films.jmdb.db.tables.records.MoviesRecord, org.jooq.types.UInteger> IDENTITY_MOVIES = createIdentity(pl.edu.agh.integracja.films.jmdb.db.tables.Movies.MOVIES, pl.edu.agh.integracja.films.jmdb.db.tables.Movies.MOVIES.MOVIEID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.ActorsRecord> KEY_ACTORS_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.jmdb.db.tables.Actors.ACTORS, pl.edu.agh.integracja.films.jmdb.db.tables.Actors.ACTORS.ACTORID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.BusinessRecord> KEY_BUSINESS_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.jmdb.db.tables.Business.BUSINESS, pl.edu.agh.integracja.films.jmdb.db.tables.Business.BUSINESS.MOVIEID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.ComposersRecord> KEY_COMPOSERS_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.jmdb.db.tables.Composers.COMPOSERS, pl.edu.agh.integracja.films.jmdb.db.tables.Composers.COMPOSERS.COMPOSERID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.DirectorsRecord> KEY_DIRECTORS_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.jmdb.db.tables.Directors.DIRECTORS, pl.edu.agh.integracja.films.jmdb.db.tables.Directors.DIRECTORS.DIRECTORID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.EditorsRecord> KEY_EDITORS_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.jmdb.db.tables.Editors.EDITORS, pl.edu.agh.integracja.films.jmdb.db.tables.Editors.EDITORS.EDITORID);
		public static final org.jooq.UniqueKey<pl.edu.agh.integracja.films.jmdb.db.tables.records.MoviesRecord> KEY_MOVIES_PRIMARY = createUniqueKey(pl.edu.agh.integracja.films.jmdb.db.tables.Movies.MOVIES, pl.edu.agh.integracja.films.jmdb.db.tables.Movies.MOVIES.MOVIEID);
	}
}
