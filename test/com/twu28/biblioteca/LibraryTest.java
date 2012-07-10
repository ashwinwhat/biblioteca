package com.twu28.biblioteca;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class LibraryTest {

    @Test
    public void should_allow_user_to_issue_book(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");

        library.getBookList().add(book);

        assertTrue(library.issueBook(new Book("Head First Java", "Kathy Sierra")));
    }

    @Test
    public void should_not_allow_user_to_issue_an_issued_book(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");

        library.getBookList().add(book);
        library.issueBook(new Book("Head First Java", "Kathy Sierra"));

        assertFalse(library.issueBook(new Book("Head First Java", "Kathy Sierra")));
    }
}
