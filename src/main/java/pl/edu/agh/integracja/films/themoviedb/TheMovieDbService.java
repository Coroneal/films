package pl.edu.agh.integracja.films.themoviedb;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import pl.edu.agh.integracja.films.films.FilmsService;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;
import pl.edu.agh.integracja.films.utils.FilmsUtils;

public class TheMovieDbService {

	private Map<String, Genre> genres;

	public void init() throws SQLException {
		FilmsService filmsService = new FilmsService();
		genres = FilmsUtils.genreMap(filmsService.getGenres());
	}

	public List<Genre> getGenres() {
		return new ArrayList<>();
	}

	public Movie getMovie(String title, String year) {
		return null;
	}

}
