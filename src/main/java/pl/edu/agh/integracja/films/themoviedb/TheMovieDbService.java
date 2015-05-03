package pl.edu.agh.integracja.films.themoviedb;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.tuple.Triple;
import org.yamj.api.common.exception.ApiExceptionType;

import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.TheMovieDbApi;
import com.omertron.themoviedbapi.enumeration.SearchType;
import com.omertron.themoviedbapi.model.movie.MovieInfo;
import com.omertron.themoviedbapi.results.ResultList;

import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;

public class TheMovieDbService {

	private static final String API_KEY = "630b83b95c5c4b50755c42155e49dd6e";
	private static final String language = null;
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	private TheMovieDbApi api;

	private Map<String, Genre> genres;

	public TheMovieDbService() {
		try {
			api = new TheMovieDbApi(API_KEY);
		} catch (MovieDbException e) {
			e.printStackTrace();
		}
	}

	public void init(Map<String, Genre> genres) {
		this.genres = genres;
	}

	public List<Genre> getGenres() throws MovieDbException {
		List<Genre> genres = new ArrayList<>();
		for (com.omertron.themoviedbapi.model.Genre genre : api.getGenreMovieList(language).getResults()) {
			genres.add(new Genre(null, genre.getName()));
		}
		return genres;
	}

	public Triple<Movie, MovieInfo, List<Integer>> getMovie(String title, String year) throws MovieDbException, ParseException {
		Boolean includeAdult = true;
		Integer page = null;
		Integer primaryReleaseYear = null;
		ResultList<MovieInfo> infoResultList = api.searchMovie(title, page, language, includeAdult, Integer.parseInt(year),
				primaryReleaseYear, SearchType.PHRASE);
		if (infoResultList.getTotalResults() == 0) {
			throw new MovieDbException(ApiExceptionType.MAPPING_FAILED, "empty");
		}
		MovieInfo movieInfo = api.getMovieInfo(infoResultList.getResults().get(0).getId(), language, "credits");
		Date releaseDate = new Date(format.parse(movieInfo.getReleaseDate()).getTime());
		Double popularity = (double) movieInfo.getPopularity();
		Double voteAverage = (double) movieInfo.getVoteAverage();
		Movie movie = new Movie(null, movieInfo.getTitle(), movieInfo.getOriginalLanguage(), releaseDate, movieInfo.getBudget(),
				movieInfo.getRevenue(), popularity, movieInfo.getVoteCount(), voteAverage, null);

		return Triple.of(movie, movieInfo, extractGenreIds(movieInfo.getGenres()));

	}

	private List<Integer> extractGenreIds(List<com.omertron.themoviedbapi.model.Genre> genresList) {
		if (genresList == null || genresList.isEmpty()) {
			return new ArrayList<>();
		}
		return genresList.stream()
				.filter(genre -> genres.containsKey(genre.getName().toLowerCase()))
				.map(genre -> genres.get(genre.getName().toLowerCase()).getId())
				.collect(Collectors.toList());
	}

}

