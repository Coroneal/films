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
public class MovielinksRecord extends org.jooq.impl.TableRecordImpl<pl.edu.agh.integracja.films.jmdb.db.tables.records.MovielinksRecord> implements org.jooq.Record2<org.jooq.types.UInteger, java.lang.String> {

	private static final long serialVersionUID = -1752742139;

	/**
	 * Setter for <code>jmdb.movielinks.movieid</code>.
	 */
	public void setMovieid(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>jmdb.movielinks.movieid</code>.
	 */
	public org.jooq.types.UInteger getMovieid() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>jmdb.movielinks.movielinkstext</code>.
	 */
	public void setMovielinkstext(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>jmdb.movielinks.movielinkstext</code>.
	 */
	public java.lang.String getMovielinkstext() {
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
		return pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks.MOVIELINKS.MOVIEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks.MOVIELINKS.MOVIELINKSTEXT;
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
		return getMovielinkstext();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovielinksRecord value1(org.jooq.types.UInteger value) {
		setMovieid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovielinksRecord value2(java.lang.String value) {
		setMovielinkstext(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovielinksRecord values(org.jooq.types.UInteger value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MovielinksRecord
	 */
	public MovielinksRecord() {
		super(pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks.MOVIELINKS);
	}

	/**
	 * Create a detached, initialised MovielinksRecord
	 */
	public MovielinksRecord(org.jooq.types.UInteger movieid, java.lang.String movielinkstext) {
		super(pl.edu.agh.integracja.films.jmdb.db.tables.Movielinks.MOVIELINKS);

		setValue(0, movieid);
		setValue(1, movielinkstext);
	}
}
