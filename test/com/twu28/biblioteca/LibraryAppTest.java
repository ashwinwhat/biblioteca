package com.twu28.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class LibraryAppTest {

    @Test
    public void should_display_welcome_message(){
        FakeConsole console = new FakeConsole();
        ArrayList<IAction> actions = createActionsArray();
        console.addInputs("1","2");

        LibraryApp libraryApp = new LibraryApp(new Library(),actions,console);

        assertThat(console.getOutput(), containsString("Welcome to Biblioteca"));
    }

    @Test
    public void should_display_choose_action_message(){
        FakeConsole console = new FakeConsole();
        ArrayList<IAction> actions = createActionsArray();
        console.addInputs("1","2");

        LibraryApp libraryApp = new LibraryApp(new Library(),actions,console);

        assertThat(console.getOutput(),containsString("Please select the operation you would like to perform:"));
    }

    @Test
    public void should_display_list_of_actions(){
        FakeConsole console = new FakeConsole();
        ArrayList<IAction> actions = createActionsArray();
        console.addInputs("1","2");

        LibraryApp libraryApp = new LibraryApp(new Library(),actions,console);

        assertThat(console.getOutput(),containsString("1) Action 1"));
    }

    @Test
    public void should_execute_selected_action(){
        FakeConsole console = new FakeConsole();
        ArrayList<IAction> actions = createActionsArray();
        console.addInputs("1","2");

        LibraryApp libraryApp = new LibraryApp(new Library(),actions,console);

        assertThat(console.getOutput(),containsString("Action1 selected."));
    }

    private ArrayList<IAction> createActionsArray() {
        ArrayList<IAction> actions = new ArrayList<IAction>();
        actions.add(createAction());
        actions.add(createAction());

        return actions;
    }

    private IAction createAction() {
        return new IAction() {
                @Override
                public String actionName() {
                    return "Action 1";
                }

                @Override
                public void execute(IConsole console) {
                    console.writeLine("Action1 selected.");
                }
            };
    }
}
