package com.twu28.biblioteca;

public class IssueBookAction implements IAction{
    private Library library = new Library();

    public IssueBookAction(Library library) {
        this.library = library;
    }

    @Override
    public String actionName() {
        return "Issue Book";
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(IConsole console) {
        for(int iterator = 0 ; iterator < library.getBookList().size() ; iterator++){
            console.writeLine(iterator+1 + ") " + library.getBookList().get(iterator).getDetails());
        }
        console.writeLine("Please enter the number of the Book you want to issue :");
        String choice = console.readLine();
        int bookNumber = Integer.parseInt(choice);
        --bookNumber;
        issueSelectedBook(console, bookNumber);
    }

    private void issueSelectedBook(IConsole console, int bookNumber) {
        if(library.issueBook(bookNumber)){
            console.writeLine("Thank You! Enjoy the book.");
        }else{
            console.writeLine("Sorry we don't have that book yet.");
        }
    }
}
