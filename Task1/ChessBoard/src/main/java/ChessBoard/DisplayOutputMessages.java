package ChessBoard;

public interface DisplayOutputMessages {
  static void displayFirstMessage() {
    System.out.println(
        "Hello and Welcome to the chessBoard. You can adjust your height and width of the ChessBoard by entering valid positive numbers and make space between them.");
  }

  static void displayEmptyInputErrorMessage() {
    System.out.println(
        "No input is entered!! Please enter 2 valid positive number that first number represent height and second one width. There must be whitespace between 2 number.");
  }

  static void printIncorrectMessage() {
    System.out.println(
        "Incorrect input has been entered!! Please enter positie numbers  and make space between them.");
  }
}
