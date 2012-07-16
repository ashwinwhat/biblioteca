package com.twu28.biblioteca;

public class Movie {

    private String title;
    private String director;
    private String rating;

    public Movie(String title, String director, String rating) {
        this.title = title;
        this.director = director;
        this.rating = rating;
    }

    public String getDetails() {
        return title + " - " + director + " - " + rating;
    }
}
