package ChessBoard;

import java.util.regex.Pattern;

public class InputValidity {
  private static final String isDigit = "^\\d+$";

  public static boolean checkValidity(String input) {
    input = input.trim();
    String[] dimensions = input.split(" ");

    if (input.length() == 0) {
      DisplayOutputMessages.displayEmptyInputErrorMessage();
      return false;
    }
    if (dimensions.length == 2
        && dimensions[0].matches(isDigit)
        && dimensions[1].matches(isDigit)) {
      return true;
    }
    DisplayOutputMessages.printIncorrectMessage();
    return false;
  }
}
