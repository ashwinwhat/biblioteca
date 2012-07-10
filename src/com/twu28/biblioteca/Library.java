package com.twu28.biblioteca;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public ArrayList<Book> getBookList() {
        return books;
    }

    public boolean issueBook(int bookNumber) {
        if(bookNumber < books.size()){
           return books.get(bookNumber).issue();
        }else{
            throw new IllegalArgumentException();
        }
    }
}
