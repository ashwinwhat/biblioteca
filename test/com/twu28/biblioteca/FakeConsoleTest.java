package com.twu28.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class FakeConsoleTest {

    @Test
    public void should_contain_message_written_to_console(){
        FakeConsole console = new FakeConsole();

        console.writeLine("Test Message");

        assertThat(console.getOutput(),containsString("Test Message"));
    }

    @Test
    public void should_save_message_read_from_console(){
        FakeConsole console = new FakeConsole();

        console.addInputs("Test Message");

        assertThat(console.readLine(), equalTo("Test Message"));
    }
}
