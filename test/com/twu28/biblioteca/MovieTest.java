package com.twu28.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class MovieTest {

    @Test
    public void must_display_movie_details(){
        Movie movie = new Movie("The DarkKnight Rises","Christopher Nolan","N/A");

        assertThat(movie.getDetails(),equalTo("The DarkKnight Rises - Christopher Nolan - N/A"));
    }
}
