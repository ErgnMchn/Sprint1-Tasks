package Number_In_Words;

public class ValidateInputImpl implements ValidateInput {
    private static final String isDigit = "^\\d+$";

    public boolean checkValidityOfInput(String input) {
        if(input.isEmpty()) {
            System.out.println("Empty input is entered!!!");
            return false;
        }
        if (input.matches(isDigit)) {
            return true;
        } else {
            System.out.println("Incorrect input is entered!!!");
            return false;
        }
    }
}
