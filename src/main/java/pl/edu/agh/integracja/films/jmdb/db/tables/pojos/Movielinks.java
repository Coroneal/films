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
public class Movielinks implements java.io.Serializable {

	private static final long serialVersionUID = -1173596249;

	private final org.jooq.types.UInteger movieid;
	private final java.lang.String        movielinkstext;

	public Movielinks(
		org.jooq.types.UInteger movieid,
		java.lang.String        movielinkstext
	) {
		this.movieid = movieid;
		this.movielinkstext = movielinkstext;
	}

	public org.jooq.types.UInteger getMovieid() {
		return this.movieid;
	}

	public java.lang.String getMovielinkstext() {
		return this.movielinkstext;
	}
}
