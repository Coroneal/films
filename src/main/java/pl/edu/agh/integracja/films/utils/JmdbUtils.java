package pl.edu.agh.integracja.films.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.tuple.Pair;

import pl.edu.agh.integracja.films.jmdb.db.tables.pojos.Movies;

public class JmdbUtils {

	private static final Pattern TITLE_PATTERN = Pattern.compile("(.+)\\s\\([0-9]{4}.{0,4}\\).*");

	public static String getTitle(Movies movies) {
		Matcher matcher = TITLE_PATTERN.matcher(movies.getTitle());
		if (matcher.matches()) {
			return matcher.group(1);
		} else {
			return movies.getTitle();
		}
	}

	public static Pair<String, String> getFirstLastName(String name) {
		name = name.replaceAll(" \\(.+\\)", "");
		String[] split = name.split(",");
		if (split.length == 1) {
			return Pair.of("", split[0].trim());
		} else if (split.length > 1) {
			return Pair.of(split[1].trim(), split[0].trim());
		} else {
			return Pair.of("", "");
		}
	}

}
