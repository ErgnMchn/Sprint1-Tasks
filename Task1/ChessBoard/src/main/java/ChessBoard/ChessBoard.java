package ChessBoard;

class ChessBoard {

  public static String[][] setChessBoard(int chessBoardHeight, int chessBoardWitdh) {
    String[][] chessBoardArr = new String[chessBoardHeight][chessBoardWitdh];

    for (int i = 0; i < chessBoardHeight; i++) {
      for (int j = 0; j < chessBoardWitdh; j++) {

        if (i % 2 == 0 && j % 2 == 0) {
          chessBoardArr[i][j] = "*";
          continue;
          // System.out.print("*");
        }
        if (i % 2 == 0 && j % 2 != 0) {
          chessBoardArr[i][j] = " ";
          continue;
          // System.out.print(" ");
        }
        if (i % 2 != 0 && j % 2 == 0) {
          chessBoardArr[i][j] = " ";
          continue;
          // System.out.print(" ");
        }
        if (i % 2 != 0 && j % 2 != 0) {
          chessBoardArr[i][j] = "*";
          //  System.out.print("*");
        }
      }
    }
    return chessBoardArr;
  }
}
