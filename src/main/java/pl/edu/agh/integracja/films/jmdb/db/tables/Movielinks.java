/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.integracja.films.jmdb.db.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.3"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Movielinks extends org.jooq.impl.TableImpl<pl.edu.agh.integracja.films.jmdb.db.tables.records.MovielinksRecord> {

	private static final long serialVersionUID = 881033027;

	/**
	 * The reference instance of <code>jmdb.movielinks</code>
	 */
	public static final pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks MOVIELINKS = new pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<pl.edu.agh.integracja.films.jmdb.db.tables.records.MovielinksRecord> getRecordType() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.records.MovielinksRecord.class;
	}

	/**
	 * The column <code>jmdb.movielinks.movieid</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.MovielinksRecord, org.jooq.types.UInteger> MOVIEID = createField("movieid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>jmdb.movielinks.movielinkstext</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.MovielinksRecord, java.lang.String> MOVIELINKSTEXT = createField("movielinkstext", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * Create a <code>jmdb.movielinks</code> table reference
	 */
	public Movielinks() {
		this("movielinks", null);
	}

	/**
	 * Create an aliased <code>jmdb.movielinks</code> table reference
	 */
	public Movielinks(java.lang.String alias) {
		this(alias, pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks.MOVIELINKS);
	}

	private Movielinks(java.lang.String alias, org.jooq.Table<pl.edu.agh.integracja.films.jmdb.db.tables.records.MovielinksRecord> aliased) {
		this(alias, aliased, null);
	}

	private Movielinks(java.lang.String alias, org.jooq.Table<pl.edu.agh.integracja.films.jmdb.db.tables.records.MovielinksRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, pl.edu.agh.integracja.films.jmdb.db.Jmdb.JMDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks as(java.lang.String alias) {
		return new pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks(alias, this);
	}

	/**
	 * Rename this table
	 */
	public pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks rename(java.lang.String name) {
		return new pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks(name, null);
	}
}
