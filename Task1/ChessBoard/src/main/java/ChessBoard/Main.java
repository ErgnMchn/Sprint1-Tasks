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
        if(height==0 || width == 0){
          System.out.println("The chess board sizes cannot be 0.Please enter the length and width starting from 1.");
          continue;
        }
        PrintChessBoard.printChessBoard(ChessBoard.setChessBoard(height,width));
        return;
      }
    }
  }
}
