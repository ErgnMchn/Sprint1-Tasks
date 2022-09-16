package ChessBoard;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class PrintChessBoardTest {

  @Test
  public void testPrintChessBord() {
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outContent));
    PrintChessBoard.printChessBoard(ChessBoard.setChessBoard(3,3));
    String expectedOutput = "* *" + System.lineSeparator() + " * " + System.lineSeparator() + "* *";
    assertEquals(expectedOutput, outContent.toString());
  }
}
