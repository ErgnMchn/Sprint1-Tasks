package ChessBoard;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class DisplayOutputMessagesTest {
  ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Test
  void testDisplayFirstMessage() {
    System.setOut(new PrintStream(outContent));
    DisplayOutputMessages.displayFirstMessage();
    String expectedOutput =
        "Hello and Welcome to the chessBoard. You can adjust your height and width of the ChessBoard by entering valid positive numbers and make space between them."
            + System.lineSeparator();

    assertEquals(expectedOutput, outContent.toString());
  }

  @Test
  void testDisplayEmptyInputErrorMessage() {
    System.setOut(new PrintStream(outContent));
    DisplayOutputMessages.displayEmptyInputErrorMessage();
    String expectedOutput =
        "No input is entered!! Please enter 2 valid positive number that first number represent height and second one width. There must be whitespace between 2 number."
            + System.lineSeparator();

    assertEquals(expectedOutput, outContent.toString());
  }

  @Test
  void testPrintIncorrectMessage() {
    System.setOut(new PrintStream(outContent));
    DisplayOutputMessages.printIncorrectMessage();
    String expectedOutput =
        "Incorrect input has been entered!! Please enter positie numbers  and make space between them."
            + System.lineSeparator();
    assertEquals(expectedOutput, outContent.toString());
  }
}
