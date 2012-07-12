package com.twu28.biblioteca;

public class QuitAction implements IAction{
    private Library library;
    public QuitAction(Library library) {
        this.library = library;
    }

    @Override
    public String actionName() {
        return "Quit";
    }

    @Override
    public void execute(IConsole console) {
        console.writeLine("Goodbye!");
    }
}
