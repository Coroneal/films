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
public class Editors implements java.io.Serializable {

	private static final long serialVersionUID = 260676955;

	private final org.jooq.types.UInteger editorid;
	private final java.lang.String        name;

	public Editors(
		org.jooq.types.UInteger editorid,
		java.lang.String        name
	) {
		this.editorid = editorid;
		this.name = name;
	}

	public org.jooq.types.UInteger getEditorid() {
		return this.editorid;
	}

	public java.lang.String getName() {
		return this.name;
	}
}
