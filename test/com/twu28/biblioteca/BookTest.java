package com.twu28.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class BookTest {

    @Test
    public void should_display_details_of_book_in_proper_format(){
        Book book = new Book("Head First Java","Kathy Sierra");

        assertThat(book.getDetails(), equalTo("Head First Java - Kathy Sierra"));
    }

    @Test
    public void should_allow_user_to_issue_book(){
        Book book  = new Book("Head First Java","Kathy Sierra");

        assertTrue(book.issue());
    }

    @Test
    public void should_not_issue_an_issued_book(){
        Book book = new Book("Head First Java","Kathy Sierra");

        book.issue();

        assertFalse(book.issue());
    }
}
