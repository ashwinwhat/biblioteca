package com.twu28.biblioteca;

public interface IAction {
    public abstract String actionName();
    public abstract void execute(IConsole console);
}
