package com.twu28.biblioteca;

public interface IAction {
    public abstract boolean isExit();
    public abstract void execute(IConsole console);
}
