import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.io.PrintStream;

public class PlayerTest {

    @Test
    public void LiLost(){

        Player zhang = new Player("张三",10,3);
        Player li = new Player("李四",10,2);

        PrintStream printStream = mock(PrintStream.class);
        Game game = new Game(zhang,li,printStream);

        game.start();

        verify(printStream).println("李四被打败了");
    }

}
