/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package komponen;

/**
 *
 * @author mzaky
 */
public class Movie {
    private String title;
    private int duration;

    public Movie(String judul, int durasi) {
        this.title = judul;
        this.duration = durasi;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    private double calculatePrice_1302213067() {
        if (duration > 150) {
            return 50000;
        } else if (duration >= 90 && duration <= 150) {
            return 40000;
        } else {
            return 30000;
        }
    }

    public void printMovieInfo_1302213067() {
        System.out.println("film dengan judul " + getTitle() + " memiliki harga tiket " + calculatePrice_1302213067());
    }
}
