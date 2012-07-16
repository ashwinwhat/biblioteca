package com.twu28.biblioteca;

public class DisplayMovieListAction implements IAction{
    private Library library;

    public DisplayMovieListAction(Library library) {
        this.library = library;
    }

    @Override
    public String actionName() {
        return "Display Movie List";
    }

    @Override
    public void execute(IConsole console) {
        for(Movie movie:library.getMovieList()){
            console.writeLine(movie.getDetails());
        }
    }
}
