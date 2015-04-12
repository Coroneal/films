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
public class Movies2composers extends org.jooq.impl.TableImpl<pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2composersRecord> {

	private static final long serialVersionUID = 1351989367;

	/**
	 * The reference instance of <code>jmdb.movies2composers</code>
	 */
	public static final pl.edu.agh.integracja.films.jmdb.db.tables.Movies2composers MOVIES2COMPOSERS = new pl.edu.agh.integracja.films.jmdb.db.tables.Movies2composers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2composersRecord> getRecordType() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2composersRecord.class;
	}

	/**
	 * The column <code>jmdb.movies2composers.movieid</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2composersRecord, org.jooq.types.UInteger> MOVIEID = createField("movieid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>jmdb.movies2composers.composerid</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2composersRecord, org.jooq.types.UInteger> COMPOSERID = createField("composerid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>jmdb.movies2composers.addition</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2composersRecord, java.lang.String> ADDITION = createField("addition", org.jooq.impl.SQLDataType.VARCHAR.length(1000), this, "");

	/**
	 * Create a <code>jmdb.movies2composers</code> table reference
	 */
	public Movies2composers() {
		this("movies2composers", null);
	}

	/**
	 * Create an aliased <code>jmdb.movies2composers</code> table reference
	 */
	public Movies2composers(java.lang.String alias) {
		this(alias, pl.edu.agh.integracja.films.jmdb.db.tables.Movies2composers.MOVIES2COMPOSERS);
	}

	private Movies2composers(java.lang.String alias, org.jooq.Table<pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2composersRecord> aliased) {
		this(alias, aliased, null);
	}

	private Movies2composers(java.lang.String alias, org.jooq.Table<pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2composersRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, pl.edu.agh.integracja.films.jmdb.db.Jmdb.JMDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public pl.edu.agh.integracja.films.jmdb.db.tables.Movies2composers as(java.lang.String alias) {
		return new pl.edu.agh.integracja.films.jmdb.db.tables.Movies2composers(alias, this);
	}

	/**
	 * Rename this table
	 */
	public pl.edu.agh.integracja.films.jmdb.db.tables.Movies2composers rename(java.lang.String name) {
		return new pl.edu.agh.integracja.films.jmdb.db.tables.Movies2composers(name, null);
	}
}