package pl.edu.agh.integracja.films.utils;

import static org.junit.Assert.*;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

import pl.edu.agh.integracja.films.jmdb.db.tables.pojos.Movies;

public class JmdbUtilsTest {

	@Test
	public void testGetTitle() throws Exception {
		assertEquals("Pulp Fiction", getTitle("Pulp Fiction"));
		assertEquals("Pulp Fiction", getTitle("Pulp Fiction (1994)"));
		assertEquals("(4) Pulp Fiction", getTitle("(4) Pulp Fiction (1994)"));
		assertEquals("Pulp Fiction", getTitle("Pulp Fiction (1994) (V)"));
		assertEquals("(4) Pulp Fiction", getTitle("(4) Pulp Fiction (1994) (V)"));
	}

	private String getTitle(String title) {
		Movies movies = new Movies(null, title, null, null);
		return JmdbUtils.getTitle(movies);
	}

	@Test
	public void testGetFirstLastName() throws Exception {
		assertEquals(Pair.of("", ""), JmdbUtils.getFirstLastName(""));
		assertEquals(Pair.of("", "Travolta"), JmdbUtils.getFirstLastName("Travolta"));
		assertEquals(Pair.of("John", "Travolta"), JmdbUtils.getFirstLastName("Travolta, John"));
		assertEquals(Pair.of("John (I)", "Travolta"), JmdbUtils.getFirstLastName("Travolta, John (I)"));
	}
}