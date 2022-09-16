package ChessBoard;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    DisplayOutputMessages.displayFirstMessage();

    while (scan.hasNextLine()) {
      String input = scan.nextLine();
      String[] dimensions = input.split(" ");
      if (InputValidity.checkValidity(input)) {
        int height = Integer.parseInt(dimensions[0]);
        int width = Integer.parseInt(dimensions[1]);
        PrintChessBoard.printChessBoard(ChessBoard.setChessBoard(height,width));
        return;
      }
    }
  }
}
