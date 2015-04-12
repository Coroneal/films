/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.integracja.films.jmdb.db.tables.records;

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
public class Movies2actorsRecord extends org.jooq.impl.TableRecordImpl<pl.edu.agh.integracja.films.jmdb.db.tables.records.Movies2actorsRecord> implements org.jooq.Record3<org.jooq.types.UInteger, org.jooq.types.UInteger, java.lang.String> {

	private static final long serialVersionUID = -2045766942;

	/**
	 * Setter for <code>jmdb.movies2actors.movieid</code>.
	 */
	public void setMovieid(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jmdb.movies2actors.movieid</code>.
	 */
	public org.jooq.types.UInteger getMovieid() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>jmdb.movies2actors.actorid</code>.
	 */
	public void setActorid(org.jooq.types.UInteger value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jmdb.movies2actors.actorid</code>.
	 */
	public org.jooq.types.UInteger getActorid() {
		return (org.jooq.types.UInteger) getValue(1);
	}

	/**
	 * Setter for <code>jmdb.movies2actors.as_character</code>.
	 */
	public void setAsCharacter(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>jmdb.movies2actors.as_character</code>.
	 */
	public java.lang.String getAsCharacter() {
		return (java.lang.String) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<org.jooq.types.UInteger, org.jooq.types.UInteger, java.lang.String> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<org.jooq.types.UInteger, org.jooq.types.UInteger, java.lang.String> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.Movies2actors.MOVIES2ACTORS.MOVIEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field2() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.Movies2actors.MOVIES2ACTORS.ACTORID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.Movies2actors.MOVIES2ACTORS.AS_CHARACTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getMovieid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value2() {
		return getActorid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getAsCharacter();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Movies2actorsRecord value1(org.jooq.types.UInteger value) {
		setMovieid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Movies2actorsRecord value2(org.jooq.types.UInteger value) {
		setActorid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Movies2actorsRecord value3(java.lang.String value) {
		setAsCharacter(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Movies2actorsRecord values(org.jooq.types.UInteger value1, org.jooq.types.UInteger value2, java.lang.String value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached Movies2actorsRecord
	 */
	public Movies2actorsRecord() {
		super(pl.edu.agh.integracja.films.jmdb.db.tables.Movies2actors.MOVIES2ACTORS);
	}

	/**
	 * Create a detached, initialised Movies2actorsRecord
	 */
	public Movies2actorsRecord(org.jooq.types.UInteger movieid, org.jooq.types.UInteger actorid, java.lang.String asCharacter) {
		super(pl.edu.agh.integracja.films.jmdb.db.tables.Movies2actors.MOVIES2ACTORS);

		setValue(0, movieid);
		setValue(1, actorid);
		setValue(2, asCharacter);
	}
}