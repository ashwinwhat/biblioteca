package com.twu28.biblioteca;

public class Book {
    @Override
    public boolean equals(Object object){
        if(object instanceof Book){
            if(((Book)object).author == this.author && ((Book)object).name == this.name){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 20;
    }

    private String name;
    private String author;
    private boolean isIssued = false;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getDetails(){
        return name + " - " + author;
    }

    public boolean issue() {
        return !hasBeenIssued();
    }

    private boolean hasBeenIssued() {
        if(!isIssued){
            isIssued = true;
            return false;
        }
        return true;
    }
}
