package pl.edu.agh.integracja.films;

import com.omertron.themoviedbapi.MovieDbException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import pl.edu.agh.integracja.films.films.FilmsService;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Genre;
import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;
import pl.edu.agh.integracja.films.jmdb.JmdbService;
import pl.edu.agh.integracja.films.jmdb.db.tables.pojos.Movies;
import pl.edu.agh.integracja.films.themoviedb.TheMovieDbService;
import pl.edu.agh.integracja.films.utils.FilmsUtils;
import pl.edu.agh.integracja.films.utils.JmdbUtils;

public class Main {

    public static void main(String[] args) throws SQLException, MovieDbException, ParseException {
        new Main().main();
    }

    private JmdbService jmdbService = new JmdbService();
    private TheMovieDbService tmdbService = new TheMovieDbService();
    private FilmsService filmsService = new FilmsService();

    private Map<String, Genre> initGenres() throws SQLException, MovieDbException {
        filmsService.insertGenres(tmdbService.getGenres());
        return FilmsUtils.genreMap(filmsService.getGenres());
    }

    private void main() throws SQLException, MovieDbException, ParseException {
        Map<String, Genre> genres = initGenres();
        tmdbService.init();

        List<Movies> movies = jmdbService.getMovies(1500);
        for (Movies movie : movies) {
            String title = JmdbUtils.getTitle(movie);

            Movie tmdbMovie = tmdbService.getMovie(title, movie.getYear());
        }
    }

}
