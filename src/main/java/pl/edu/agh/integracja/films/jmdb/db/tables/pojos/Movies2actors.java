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
public class Movies2actors implements java.io.Serializable {

	private static final long serialVersionUID = 1228730194;

	private final org.jooq.types.UInteger movieid;
	private final org.jooq.types.UInteger actorid;
	private final java.lang.String        asCharacter;

	public Movies2actors(
		org.jooq.types.UInteger movieid,
		org.jooq.types.UInteger actorid,
		java.lang.String        asCharacter
	) {
		this.movieid = movieid;
		this.actorid = actorid;
		this.asCharacter = asCharacter;
	}

	public org.jooq.types.UInteger getMovieid() {
		return this.movieid;
	}

	public org.jooq.types.UInteger getActorid() {
		return this.actorid;
	}

	public java.lang.String getAsCharacter() {
		return this.asCharacter;
	}
}
