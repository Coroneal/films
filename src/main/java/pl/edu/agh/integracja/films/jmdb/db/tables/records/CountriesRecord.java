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
public class CountriesRecord extends org.jooq.impl.TableRecordImpl<pl.edu.agh.integracja.films.jmdb.db.tables.records.CountriesRecord> implements org.jooq.Record2<org.jooq.types.UInteger, java.lang.String> {

	private static final long serialVersionUID = -239298458;

	/**
	 * Setter for <code>jmdb.countries.movieid</code>.
	 */
	public void setMovieid(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jmdb.countries.movieid</code>.
	 */
	public org.jooq.types.UInteger getMovieid() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>jmdb.countries.country</code>.
	 */
	public void setCountry(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jmdb.countries.country</code>.
	 */
	public java.lang.String getCountry() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<org.jooq.types.UInteger, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.Countries.COUNTRIES.MOVIEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.Countries.COUNTRIES.COUNTRY;
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
	public java.lang.String value2() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountriesRecord value1(org.jooq.types.UInteger value) {
		setMovieid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountriesRecord value2(java.lang.String value) {
		setCountry(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CountriesRecord values(org.jooq.types.UInteger value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CountriesRecord
	 */
	public CountriesRecord() {
		super(pl.edu.agh.integracja.films.jmdb.db.tables.Countries.COUNTRIES);
	}

	/**
	 * Create a detached, initialised CountriesRecord
	 */
	public CountriesRecord(org.jooq.types.UInteger movieid, java.lang.String country) {
		super(pl.edu.agh.integracja.films.jmdb.db.tables.Countries.COUNTRIES);

		setValue(0, movieid);
		setValue(1, country);
	}
}
