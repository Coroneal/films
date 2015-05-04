/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.integracja.films.films.db.tables.records;

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
public class MovieRecord extends org.jooq.impl.UpdatableRecordImpl<pl.edu.agh.integracja.films.films.db.tables.records.MovieRecord> implements org.jooq.Record14<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.Long> {

	private static final long serialVersionUID = 794240344;

	/**
	 * Setter for <code>films.Movie.id</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>films.Movie.id</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>films.Movie.title</code>.
	 */
	public void setTitle(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>films.Movie.title</code>.
	 */
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>films.Movie.language</code>.
	 */
	public void setLanguage(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>films.Movie.language</code>.
	 */
	public java.lang.String getLanguage() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>films.Movie.release_date</code>.
	 */
	public void setReleaseDate(java.sql.Date value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>films.Movie.release_date</code>.
	 */
	public java.sql.Date getReleaseDate() {
		return (java.sql.Date) getValue(3);
	}

	/**
	 * Setter for <code>films.Movie.budget</code>.
	 */
	public void setBudget(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>films.Movie.budget</code>.
	 */
	public java.lang.Long getBudget() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>films.Movie.revenue</code>.
	 */
	public void setRevenue(java.lang.Long value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>films.Movie.revenue</code>.
	 */
	public java.lang.Long getRevenue() {
		return (java.lang.Long) getValue(5);
	}

	/**
	 * Setter for <code>films.Movie.popularity</code>.
	 */
	public void setPopularity(java.lang.Double value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>films.Movie.popularity</code>.
	 */
	public java.lang.Double getPopularity() {
		return (java.lang.Double) getValue(6);
	}

	/**
	 * Setter for <code>films.Movie.vote_count</code>.
	 */
	public void setVoteCount(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>films.Movie.vote_count</code>.
	 */
	public java.lang.Integer getVoteCount() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>films.Movie.vote_average</code>.
	 */
	public void setVoteAverage(java.lang.Double value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>films.Movie.vote_average</code>.
	 */
	public java.lang.Double getVoteAverage() {
		return (java.lang.Double) getValue(8);
	}

	/**
	 * Setter for <code>films.Movie.imdb_rating</code>.
	 */
	public void setImdbRating(java.lang.Double value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>films.Movie.imdb_rating</code>.
	 */
	public java.lang.Double getImdbRating() {
		return (java.lang.Double) getValue(9);
	}

	/**
	 * Setter for <code>films.Movie.imdb_votes</code>.
	 */
	public void setImdbVotes(java.lang.Integer value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>films.Movie.imdb_votes</code>.
	 */
	public java.lang.Integer getImdbVotes() {
		return (java.lang.Integer) getValue(10);
	}

	/**
	 * Setter for <code>films.Movie.tomato_rating</code>.
	 */
	public void setTomatoRating(java.lang.Double value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>films.Movie.tomato_rating</code>.
	 */
	public java.lang.Double getTomatoRating() {
		return (java.lang.Double) getValue(11);
	}

	/**
	 * Setter for <code>films.Movie.tomato_user_rating</code>.
	 */
	public void setTomatoUserRating(java.lang.Double value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>films.Movie.tomato_user_rating</code>.
	 */
	public java.lang.Double getTomatoUserRating() {
		return (java.lang.Double) getValue(12);
	}

	/**
	 * Setter for <code>films.Movie.jmdbid</code>.
	 */
	public void setJmdbid(java.lang.Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>films.Movie.jmdbid</code>.
	 */
	public java.lang.Long getJmdbid() {
		return (java.lang.Long) getValue(13);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record14 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.Long> fieldsRow() {
		return (org.jooq.Row14) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row14<java.lang.Integer, java.lang.String, java.lang.String, java.sql.Date, java.lang.Long, java.lang.Long, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.Integer, java.lang.Double, java.lang.Double, java.lang.Long> valuesRow() {
		return (org.jooq.Row14) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date> field4() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.RELEASE_DATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.BUDGET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field6() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.REVENUE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field7() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.POPULARITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.VOTE_COUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field9() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.VOTE_AVERAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field10() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.IMDB_RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field11() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.IMDB_VOTES;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field12() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.TOMATO_RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field13() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.TOMATO_USER_RATING;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field14() {
		return pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE.JMDBID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLanguage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date value4() {
		return getReleaseDate();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getBudget();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value6() {
		return getRevenue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value7() {
		return getPopularity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getVoteCount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value9() {
		return getVoteAverage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value10() {
		return getImdbRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value11() {
		return getImdbVotes();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value12() {
		return getTomatoRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value13() {
		return getTomatoUserRating();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value14() {
		return getJmdbid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value2(java.lang.String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value3(java.lang.String value) {
		setLanguage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value4(java.sql.Date value) {
		setReleaseDate(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value5(java.lang.Long value) {
		setBudget(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value6(java.lang.Long value) {
		setRevenue(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value7(java.lang.Double value) {
		setPopularity(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value8(java.lang.Integer value) {
		setVoteCount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value9(java.lang.Double value) {
		setVoteAverage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value10(java.lang.Double value) {
		setImdbRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value11(java.lang.Integer value) {
		setImdbVotes(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value12(java.lang.Double value) {
		setTomatoRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value13(java.lang.Double value) {
		setTomatoUserRating(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord value14(java.lang.Long value) {
		setJmdbid(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MovieRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.String value3, java.sql.Date value4, java.lang.Long value5, java.lang.Long value6, java.lang.Double value7, java.lang.Integer value8, java.lang.Double value9, java.lang.Double value10, java.lang.Integer value11, java.lang.Double value12, java.lang.Double value13, java.lang.Long value14) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MovieRecord
	 */
	public MovieRecord() {
		super(pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE);
	}

	/**
	 * Create a detached, initialised MovieRecord
	 */
	public MovieRecord(java.lang.Integer id, java.lang.String title, java.lang.String language, java.sql.Date releaseDate, java.lang.Long budget, java.lang.Long revenue, java.lang.Double popularity, java.lang.Integer voteCount, java.lang.Double voteAverage, java.lang.Double imdbRating, java.lang.Integer imdbVotes, java.lang.Double tomatoRating, java.lang.Double tomatoUserRating, java.lang.Long jmdbid) {
		super(pl.edu.agh.integracja.films.films.db.tables.Movie.MOVIE);

		setValue(0, id);
		setValue(1, title);
		setValue(2, language);
		setValue(3, releaseDate);
		setValue(4, budget);
		setValue(5, revenue);
		setValue(6, popularity);
		setValue(7, voteCount);
		setValue(8, voteAverage);
		setValue(9, imdbRating);
		setValue(10, imdbVotes);
		setValue(11, tomatoRating);
		setValue(12, tomatoUserRating);
		setValue(13, jmdbid);
	}
}
