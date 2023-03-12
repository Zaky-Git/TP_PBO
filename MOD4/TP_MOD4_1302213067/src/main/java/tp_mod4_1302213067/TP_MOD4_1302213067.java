/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package tp_mod4_1302213067;

import komponen.Movie;
import utama.MovieTheater;

/**
 *
 * @author mzaky
 */
public class TP_MOD4_1302213067 {

    public static void main(String[] args) {
        Movie[] movies = {
            new Movie("Star Wars", 80),
            new Movie("Star Wars 2", 148),
            new Movie("Star Wars 3", 151)
        };

        MovieTheater XXI = new MovieTheater();
        XXI.setMovies(movies);

        for (Movie movie : XXI.getMovie()) {
            movie.printMovieInfo_1302213067();
        }

        System.out.println("");

        XXI.printAllMovieInfo_1302213067();

    }
}
