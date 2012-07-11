package com.twu28.biblioteca;

import java.util.ArrayList;

public class LibraryApp {
    Library library;
    IConsole console;
    ArrayList<IAction> actions = new ArrayList<IAction>();

    public LibraryApp(Library library, ArrayList<IAction> actions, IConsole console) {
        this.library = library;
        this.console = console;
        this.actions = actions;
        displayWelcomeMessage();
        runApp();
    }

    private void runApp() {
        boolean isQuitAction = false;
        do {
            console.writeLine("\nPlease select the operation you would like to perform:");
            for (int iterator = 0; iterator < actions.size(); iterator++) {
                displayActionName(iterator);
            }
            String userChoice = console.readLine();
            int index = Integer.parseInt(userChoice);
            --index;
            if (index == (actions.size() - 1)) {
                isQuitAction = true;
            }
            actions.get(index).execute(console);
        } while (!isQuitAction);
    }

    private void displayActionName(int iterator) {
        IAction action = actions.get(iterator);
        console.writeLine(iterator + 1 + ") " + action.actionName());
    }

    private void displayWelcomeMessage() {
        console.writeLine("Welcome to Biblioteca");
    }

    public static void main(String[] args){
        Library library = new Library();
        library.getBookList().add(new Book("Head First Java","Kathy Sierra"));
        library.getBookList().add(new Book("Catch 22","Joseph Heller"));
        MainConsole console = new MainConsole();
        ArrayList<IAction> actions = new ArrayList<IAction>();
        actions.add(new DisplayBookListAction(library));
        actions.add(new IssueBookAction(library));
        actions.add(new CheckLibraryNumberAction(library));
        actions.add(new QuitAction(library));

        LibraryApp libraryApp = new LibraryApp(library,actions,console);
    }
}
