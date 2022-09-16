public class InputValidity {
    private static final String isDouble = "(\\d*\\.?\\d+)";
    public static boolean checkValidityFirstEnvelopeHeight(String input) {
        if (input.isEmpty()) {
            DisplayOutMessages.firstEnvelopeHeightIsEmpty();
            return false;
        }
        if (input.matches(isDouble)) {
            return true;
        } else DisplayOutMessages.firstEnvelopeHeightIsIncorrect();

        return false;
    }
    public static boolean checkValidityFirstEnvelopeWidth(String input) {
        String[] dimensions = input.split(" ");
        if (input.isEmpty()) {
            DisplayOutMessages.firstEnvelopeWidthIsEmpty();
            return false;
        }
        if (dimensions[0].matches(isDouble)) {
            return true;
        } else DisplayOutMessages.firstEnvelopeWidthIsIncorrect();
        return false;
    }
    public static boolean checkValiditySecondEnvelopeHeight(String input) {
        String[] dimensions = input.split(" ");
        if (input.isEmpty()) {
            DisplayOutMessages.secondEnvelopeHeightIsEmpty();
            return false;
        }
        if (dimensions[0].matches(isDouble)) {
            return true;
        } else DisplayOutMessages.secondEnvelopeHeightIsIncorrect();
        return false;
    }
    public static boolean checkValiditySecondEnvelopeWidth(String input) {
        String[] dimensions = input.split(" ");
        if (input.isEmpty()) {
            DisplayOutMessages.secondEnvelopeWidthIsEmpty();
            return false;
        }
        if (dimensions[0].matches(isDouble)) {
            return true;
        } else DisplayOutMessages.secondEnvelopeWidthIsIncorrect();
        return false;
    }
}