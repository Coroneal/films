/**
 * This class is generated by jOOQ
 */
package pl.edu.agh.integracja.films.jmdb.db.tables.pojos;

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
public class Movies implements java.io.Serializable {

	private static final long serialVersionUID = -358811009;

	private final org.jooq.types.UInteger movieid;
	private final java.lang.String        title;
	private final java.lang.String        year;
	private final java.lang.String        imdbid;

	public Movies(
		org.jooq.types.UInteger movieid,
		java.lang.String        title,
		java.lang.String        year,
		java.lang.String        imdbid
	) {
		this.movieid = movieid;
		this.title = title;
		this.year = year;
		this.imdbid = imdbid;
	}

	public org.jooq.types.UInteger getMovieid() {
		return this.movieid;
	}

	public java.lang.String getTitle() {
		return this.title;
	}

	public java.lang.String getYear() {
		return this.year;
	}

	public java.lang.String getImdbid() {
		return this.imdbid;
	}
}
