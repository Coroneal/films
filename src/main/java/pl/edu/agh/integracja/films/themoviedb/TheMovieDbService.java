package pl.edu.agh.integracja.films.themoviedb;

import com.omertron.themoviedbapi.MovieDbException;
import com.omertron.themoviedbapi.TheMovieDbApi;
import com.omertron.themoviedbapi.enumeration.SearchType;
import com.omertron.themoviedbapi.model.movie.MovieInfo;
import com.omertron.themoviedbapi.results.ResultList;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.yamj.api.common.exception.ApiExceptionType;
import pl.edu.agh.integracja.films.films.FilmsService;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;
import pl.edu.agh.integracja.films.utils.FilmsUtils;

public class TheMovieDbService {

    private static final String API_KEY = "630b83b95c5c4b50755c42155e49dd6e";
    private static final String language = "en";
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

    public void init() throws SQLException {
        FilmsService filmsService = new FilmsService();
        genres = FilmsUtils.genreMap(filmsService.getGenres());
    }

    public List<Genre> getGenres() throws MovieDbException {
        List<Genre> genres = new ArrayList<>();
        for (com.omertron.themoviedbapi.model.Genre genre : api.getGenreMovieList(language).getResults()) {
            genres.add(new Genre(null, genre.getName()));
        }
        return genres;
    }

    public Movie getMovie(String title, String year) throws MovieDbException, ParseException {
        Boolean includeAdult = true;
        Integer page = null;
        Integer primaryReleaseYear = null;
        ResultList<MovieInfo> infoResultList = api.searchMovie(title, page, language, includeAdult, Integer.parseInt(year), primaryReleaseYear, SearchType.PHRASE);
        if (infoResultList.getTotalResults() != 1) {
            throw new MovieDbException(ApiExceptionType.MAPPING_FAILED, "empty or not unique result");
        }
        MovieInfo movieInfo = api.getMovieInfo(infoResultList.getResults().get(0).getId(), language);
        Date releaseDate = new Date(format.parse(movieInfo.getReleaseDate()).getTime());
        Double popularity = (double) movieInfo.getPopularity();
        Double voteAverage = (double) movieInfo.getVoteAverage();
        return new Movie(null, movieInfo.getTitle(), movieInfo.getOriginalLanguage(),
                releaseDate, movieInfo.getBudget(), movieInfo.getRevenue(),
                popularity, movieInfo.getVoteCount(), voteAverage, extractGenreId(movieInfo.getGenres()), null);

    }

    private int extractGenreId(List<com.omertron.themoviedbapi.model.Genre> genresList) {
        if (genresList == null || genresList.isEmpty()) {
            return 0;
        }
        return genres.get(genresList.get(0).getName()).getId();
    }

}

