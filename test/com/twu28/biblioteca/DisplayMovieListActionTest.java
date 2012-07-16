package com.twu28.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class DisplayMovieListActionTest {

    @Test
    public void should_display_action_name(){
        DisplayMovieListAction action = new DisplayMovieListAction(new Library());

        assertThat(action.actionName(),equalTo ("Display Movie List"));
    }

    @Test
    public void should_display_movie_list(){
        FakeConsole console = new FakeConsole();
        DisplayMovieListAction action = new DisplayMovieListAction(new Library());

        action.execute(console);

        assertThat(console.getOutput(),containsString("Fight Club - David Fincher - 8.6"));
    }
}
