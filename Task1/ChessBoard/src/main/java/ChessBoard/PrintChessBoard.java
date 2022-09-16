package ChessBoard;

public class PrintChessBoard {
  public static void printChessBoard(String[][] dimensions) {
    for (int i = 0; i < dimensions.length; i++) {
      for (int j = 0; j < dimensions[i].length; j++) {
        System.out.print(dimensions[i][j]);
      }
      if (dimensions.length - 1 == i) {
        return;
      }
      System.out.println();
    }
  }
}
