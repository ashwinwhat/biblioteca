package com.twu28.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class CheckLibraryNumberActionTest {

    @Test
    public void should_display_action_name(){
        CheckLibraryNumberAction action = new CheckLibraryNumberAction(new Library());

        assertThat(action.actionName(), equalTo("Check Library Number"));
    }

    @Test
    public void should_display_talk_to_librarian_message(){
        CheckLibraryNumberAction action = new CheckLibraryNumberAction(new Library());
        FakeConsole console = new FakeConsole();

        action.execute(console);

        assertThat(console.getOutput(), containsString("Please talk to the librarian."));
    }
}
