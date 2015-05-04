package pl.edu.agh.integracja.films.themoviedb;

import com.omertron.omdbapi.OMDBException;
import com.omertron.omdbapi.OmdbApi;
import com.omertron.omdbapi.model.OmdbVideoFull;
import com.omertron.omdbapi.tools.OmdbBuilder;

import pl.edu.agh.integracja.films.films.db.tables.pojos.Movie;

public class OmdbService {

	private OmdbApi omdb = new OmdbApi();

	public void setAdditionalInfo(Movie movie) {

		try {
			OmdbVideoFull info = omdb.getInfo(
					new OmdbBuilder()
							.setTitle(movie.getTitle())
							.setTomatoesOn()
							.build()
			);

			movie.setImdbRating(Double.parseDouble(info.getImdbRating()));
			movie.setImdbVotes(Integer.parseInt(info.getImdbVotes().replace(",", "")));
			movie.setTomatoRating(Double.parseDouble(info.getTomatoRating()));
			movie.setTomatoUserRating(Double.parseDouble(info.getTomatoUserRating()));
		} catch (OMDBException e) {
			System.err.println("Cannot find movie using OMDb: " + movie.getTitle());
		} catch (NumberFormatException e) {
			System.err.println("Cannot parse number from OMDb. Movie: " + movie.getTitle() + ", msg: " + e.getMessage());
		}

	}

}
