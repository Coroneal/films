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
public class Ratings implements java.io.Serializable {

	private static final long serialVersionUID = 1615782337;

	private final org.jooq.types.UInteger movieid;
	private final java.lang.String        rank;
	private final org.jooq.types.UInteger votes;
	private final java.lang.String        distribution;

	public Ratings(
		org.jooq.types.UInteger movieid,
		java.lang.String        rank,
		org.jooq.types.UInteger votes,
		java.lang.String        distribution
	) {
		this.movieid = movieid;
		this.rank = rank;
		this.votes = votes;
		this.distribution = distribution;
	}

	public org.jooq.types.UInteger getMovieid() {
		return this.movieid;
	}

	public java.lang.String getRank() {
		return this.rank;
	}

	public org.jooq.types.UInteger getVotes() {
		return this.votes;
	}

	public java.lang.String getDistribution() {
		return this.distribution;
	}
}
