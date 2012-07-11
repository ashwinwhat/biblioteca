package com.twu28.biblioteca;

public class DisplayBookListAction implements IAction {
     private Library library;
    public DisplayBookListAction(Library library) {
        this.library = library;
    }

    @Override
    public String actionName() {
        return "Display Book List";
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(IConsole console) {
        console.writeLine("Following is the List of Books :");
        for(Book book:library.getBookList()){
            writeBookDetail(console, book);
        }
    }

    private void writeBookDetail(IConsole console, Book book) {
        console.writeLine(book.getDetails());
    }
}
