package ChessBoard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {

  @Test
  public void testSetChessBoard() {
    String[][] expectedArr =
        new String[][] {
          {"*", " "},
          {" ", "*"},
          {"*", " "}
        };
    assertArrayEquals(expectedArr, ChessBoard.setChessBoard(3,2));
  }
}
