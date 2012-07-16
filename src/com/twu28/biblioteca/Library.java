package com.twu28.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();
    private ArrayList<Movie> movies = new ArrayList<Movie>();

    public Library(){
        populateMovieList();
    }

    public ArrayList<Book> getBookList() {
        return books;
    }

    public ArrayList<Movie> getMovieList(){
        return movies;
    }

    private void populateMovieList(){
        movies.add(new Movie("The Shawshank Redemption","Frank Darabont","9.2"));
        movies.add(new Movie("Pulp Fiction","Quentin Tarrantino","8.9"));
        movies.add(new Movie("The Dark Knight","Christopher Nolan","8.7"));
        movies.add(new Movie("Fight Club","David Fincher","8.6"));
        movies.add(new Movie("The Matrix","Andrew Wachowski","8.4"));
        movies.add(new Movie("Forrest Gump","Robert Zemeckis","8.4"));
        movies.add(new Movie("Psycho","Alfred Hitchcock","8.3"));
        movies.add(new Movie("Memento","Christopher Nolan","8.2"));
        movies.add(new Movie("Alien","Ridley Scott","8.0"));
        movies.add(new Movie("The Departed","Martin Scorsese","9.2"));
        movies.add(new Movie("Gladiator","Ridley Scott","8.3"));
        movies.add(new Movie("Snatch","Guy Ritchie","8.1"));
        movies.add(new Movie("Ted","Seth McFarlene","N/A"));
        movies.add(new Movie("Brave","Mark Andrews","N/A"));
        movies.add(new Movie("Savages","Oliver Stone","N/A"));
    }

    public boolean issueBook(int bookNumber) {
        if(bookNumber < books.size()){
           return books.get(bookNumber).issue();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
