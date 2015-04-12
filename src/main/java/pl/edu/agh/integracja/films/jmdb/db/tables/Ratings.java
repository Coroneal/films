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
public class Ratings extends org.jooq.impl.TableImpl<pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord> {

	private static final long serialVersionUID = -338169614;

	/**
	 * The reference instance of <code>jmdb.ratings</code>
	 */
	public static final pl.edu.agh.integracja.films.jmdb.db.tables.Ratings RATINGS = new pl.edu.agh.integracja.films.jmdb.db.tables.Ratings();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord> getRecordType() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord.class;
	}

	/**
	 * The column <code>jmdb.ratings.movieid</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord, org.jooq.types.UInteger> MOVIEID = createField("movieid", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>jmdb.ratings.rank</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord, java.lang.String> RANK = createField("rank", org.jooq.impl.SQLDataType.CHAR.length(4).nullable(false), this, "");

	/**
	 * The column <code>jmdb.ratings.votes</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord, org.jooq.types.UInteger> VOTES = createField("votes", org.jooq.impl.SQLDataType.INTEGERUNSIGNED, this, "");

	/**
	 * The column <code>jmdb.ratings.distribution</code>.
	 */
	public final org.jooq.TableField<pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord, java.lang.String> DISTRIBUTION = createField("distribution", org.jooq.impl.SQLDataType.CHAR.length(10).nullable(false), this, "");

	/**
	 * Create a <code>jmdb.ratings</code> table reference
	 */
	public Ratings() {
		this("ratings", null);
	}

	/**
	 * Create an aliased <code>jmdb.ratings</code> table reference
	 */
	public Ratings(java.lang.String alias) {
		this(alias, pl.edu.agh.integracja.films.jmdb.db.tables.Ratings.RATINGS);
	}

	private Ratings(java.lang.String alias, org.jooq.Table<pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord> aliased) {
		this(alias, aliased, null);
	}

	private Ratings(java.lang.String alias, org.jooq.Table<pl.edu.agh.integracja.films.jmdb.db.tables.records.RatingsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, pl.edu.agh.integracja.films.jmdb.db.Jmdb.JMDB, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public pl.edu.agh.integracja.films.jmdb.db.tables.Ratings as(java.lang.String alias) {
		return new pl.edu.agh.integracja.films.jmdb.db.tables.Ratings(alias, this);
	}

	/**
	 * Rename this table
	 */
	public pl.edu.agh.integracja.films.jmdb.db.tables.Ratings rename(java.lang.String name) {
		return new pl.edu.agh.integracja.films.jmdb.db.tables.Ratings(name, null);
	}
}