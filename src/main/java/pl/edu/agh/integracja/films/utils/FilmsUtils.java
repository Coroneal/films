package pl.edu.agh.integracja.films.utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;

public class FilmsUtils {

	public static Map<String, Genre> genreMap(List<Genre> genres) {
		return genres.stream()
				.collect(Collectors.toMap(
						Genre::getName,
						genre -> genre
				));
	}
}
