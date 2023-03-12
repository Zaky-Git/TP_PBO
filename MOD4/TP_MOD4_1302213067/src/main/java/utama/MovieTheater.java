/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utama;

import komponen.Movie;

/**
 *
 * @author mzaky
 */
public class MovieTheater {

    private Movie[] movies;

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    public Movie[] getMovie() {
        return movies;
    }

    public void printAllMovieInfo_1302213067() {
        int i = 0;
        System.out.println("Daftar Film dalam theater ini:");
        for (Movie movie : movies) {
            i++;
            System.out.println("Film #" + i + " " + movie.getTitle() + " dengan durasi "
                    + movie.getDuration() + " menit ");
            movie.printMovieInfo_1302213067();
        }
    }
}
