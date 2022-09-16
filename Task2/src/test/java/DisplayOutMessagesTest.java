import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DisplayOutMessagesTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Test
    void testFirstEnvelopeHeightIsEmpty(){
        System.setOut(new PrintStream(outContent));
        DisplayOutMessages.firstEnvelopeHeightIsEmpty();
        String expectedOutput = "Empty input is entered. Please enter the Height of the first envelope" + System.lineSeparator();
        assertEquals(expectedOutput,outContent.toString());
    }
    @Test
    void testFirstEnvelopeWidthIsEmpty(){
        System.setOut(new PrintStream(outContent));
        DisplayOutMessages.firstEnvelopeWidthIsEmpty();
        String expectedOutput = "Empty input is entered. Please enter the width of the first envelope" + System.lineSeparator();
        assertEquals(expectedOutput,outContent.toString());
    }
    @Test
    void testSecondEnvelopeHeightIsEmpty(){
        System.setOut(new PrintStream(outContent));
        DisplayOutMessages.secondEnvelopeHeightIsEmpty();
        String expectedOutput = "Empty input is entered. Please enter the height of the second envelope" + System.lineSeparator();
        assertEquals(expectedOutput,outContent.toString());
    }
    @Test
    void testSecondEnvelopeWidthIsEmpty(){
        System.setOut(new PrintStream(outContent));
        DisplayOutMessages.secondEnvelopeWidthIsEmpty();
        String expectedOutput = "Empty input is entered. Please enter the width of the second envelope." + System.lineSeparator();
        assertEquals(expectedOutput,outContent.toString());
    }
    @Test
    void firstEnvelopeHeightIsIncorrect(){
        System.setOut(new PrintStream(outContent));
        DisplayOutMessages.firstEnvelopeHeightIsIncorrect();
        String expectedOutput = "Incorrect input is entered.Please enter the Height of the first envelope." + System.lineSeparator();
        assertEquals(expectedOutput,outContent.toString());
    }
    @Test
    void testFirstEnvelopeWidthIsIncorrect(){
        System.setOut(new PrintStream(outContent));
        DisplayOutMessages.firstEnvelopeWidthIsIncorrect();
        String expectedOutput = "Incorrect input is entered.Please enter the width of the first envelope" + System.lineSeparator();
        assertEquals(expectedOutput,outContent.toString());
    }
    @Test
    void testSecondEnvelopeHeightIsIncorrect(){
        System.setOut(new PrintStream(outContent));
        DisplayOutMessages.secondEnvelopeHeightIsIncorrect();
        String expectedOutput = "Incorrect input is entered.Please enter the height of the second envelope" + System.lineSeparator();
        assertEquals(expectedOutput,outContent.toString());
    }
    @Test
    void secondEnvelopeWidthIsIncorrect(){
        System.setOut(new PrintStream(outContent));
        DisplayOutMessages.secondEnvelopeWidthIsIncorrect();
        String expectedOutput = "Incorrect input is entered.Please enter the width of the second envelope." + System.lineSeparator();
        assertEquals(expectedOutput,outContent.toString());
    }
}