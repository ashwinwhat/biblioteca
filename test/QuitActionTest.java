import com.twu28.biblioteca.FakeConsole;
import com.twu28.biblioteca.Library;
import com.twu28.biblioteca.QuitAction;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class QuitActionTest {

    @Test
    public void should_display_action_name(){
        QuitAction action = new QuitAction(new Library());

        assertThat(action.actionName(),equalTo("Quit"));
    }

    @Test
    public void should_display_goodbye_message(){
        QuitAction action = new QuitAction(new Library());
        FakeConsole console = new FakeConsole();

        action.execute(console);

        assertThat(console.getOutput(),containsString("Goodbye!"));
    }
}
