package com.twu28.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> getBookList() {
        return books;
    }

    public boolean issueBook(Book book) {
        if(books.contains(book)){
           return books.get(books.indexOf(book)).issue();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
