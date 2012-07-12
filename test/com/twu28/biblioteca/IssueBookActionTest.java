package com.twu28.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class IssueBookActionTest {

    @Test
    public void should_display_name_of_action(){
        IssueBookAction action = new IssueBookAction(new Library());

        assertThat(action.actionName(), equalTo("Issue Book"));
    }

    @Test
    public void should_display_list_of_books(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");
        library.getBookList().add(book);
        FakeConsole console = new FakeConsole();
        IssueBookAction action = new IssueBookAction(library);
        console.addInputs("1");

        action.execute(console);

        assertThat(console.getOutput(), containsString("1) Head First Java - Kathy Sierra"));
    }

    @Test
    public void should_ask_for_user_input_on_book_number(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");
        library.getBookList().add(book);
        FakeConsole console = new FakeConsole();
        IssueBookAction action = new IssueBookAction(library);
        console.addInputs("1");

        action.execute(console);

        assertThat(console.getOutput(), containsString("Please enter the number of the Book you want to issue :"));
    }

    @Test
    public void should_issue_selected_book_if_input_is_valid_and_book_not_issued(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");
        library.getBookList().add(book);
        FakeConsole console = new FakeConsole();
        IssueBookAction action = new IssueBookAction(library);
        console.addInputs("1");

        action.execute(console);

        assertThat(console.getOutput(), containsString("Thank You! Enjoy the book."));
    }

    @Test
    public void should_not_issue_selected_book_if_input_is_valid_and_book_is_issued(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");
        library.getBookList().add(book);
        FakeConsole console = new FakeConsole();
        IssueBookAction action = new IssueBookAction(library);
        console.addInputs("1");
        action.execute(console);

        console.addInputs("1");
        action.execute(console);

        assertThat(console.getOutput(), containsString("Sorry we don't have that book yet."));
    }

    @Test
    public void should_display_message_if_input_is_invalid(){
        Library library = new Library();
        Book book = new Book("Head First Java","Kathy Sierra");
        library.getBookList().add(book);
        FakeConsole console = new FakeConsole();
        IssueBookAction action = new IssueBookAction(library);
        console.addInputs("2");

        action.execute(console);

        assertThat(console.getOutput(), containsString("Please select a valid option!"));
    }
}
