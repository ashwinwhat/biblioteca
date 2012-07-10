package com.twu28.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class DisplayBookListActionTest {

    @Test
    public void should_display_heading(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");
        library.getBookList().add(book);
        FakeConsole console = new FakeConsole();
        DisplayBookListAction action = new DisplayBookListAction(library);

        action.execute(console);

        assertThat(console.getOutput(), containsString("Following is the List of Books :"));
    }

    @Test
    public void should_display_book_details(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");
        library.getBookList().add(book);
        FakeConsole console = new FakeConsole();
        DisplayBookListAction action = new DisplayBookListAction(library);

        action.execute(console);

        assertThat(console.getOutput(), containsString("Head First Java - Kathy Sierra"));
    }
}
