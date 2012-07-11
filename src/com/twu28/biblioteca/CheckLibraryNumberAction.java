package com.twu28.biblioteca;

public class CheckLibraryNumberAction implements IAction{

    private Library library;

    public CheckLibraryNumberAction(Library library){
        this.library = library;
    }

    @Override
    public String actionName() {
        return "Check Library Number";
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(IConsole console) {
        console.writeLine("Please talk to the librarian.");
    }
}
