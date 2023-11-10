package EndTask;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void testStop() {
        CharBackground Bground = new CharBackground();
        Bground.readInput("stop");
        String expected = "Your text contains 0 rows and 0 letters.";
        assertEquals(expected, Bground.readResults());
    }
    @Test
    public void testRowsNumber() {
        CharBackground Bground = new CharBackground();

        Bground.readInput("Rad nummer ett");
        Bground.readInput("Rad nummer två");
        Bground.readInput("Rad nummer tre");
        Bground.readInput("stop");

        assertEquals(3, Bground.getRowsNumber);
    }
    @Test
    public void testNoInput() {
    CharBackground Bground = new CharBackground();
    String noInput = "";

    Bground.readInput(noInput);
    assertEquals(0, Bground.getRows());
    assertEquals(0, Bground.getLetters);
    }


}
