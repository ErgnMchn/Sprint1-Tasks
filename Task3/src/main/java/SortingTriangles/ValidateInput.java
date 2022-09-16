package SortingTriangles;

public class ValidateInput {
    private static final String isDouble = "(\\d*\\.?\\d+)";
    private static final String isLetter = "([\\s+?a-zA-Z\\d\\s+]*)";
    public static boolean inputIsValid(String input) {

        if(input.isEmpty()){
            System.out.println("Empty input is entered!!!");
            return false;
        }

        String[] inputArr = input.split(",");
        try{
        inputArr[0]= inputArr[0].trim();
        inputArr[1]= inputArr[1].trim();
        inputArr[2]= inputArr[2].trim();
        inputArr[3]= inputArr[3].trim();}
        catch (RuntimeException e) {
            System.out.println("Incorrect input is entered!!!");
            return false;
        }
        if (inputArr.length==4 && inputArr[0].matches(isLetter) && inputArr[1].matches(isDouble) && inputArr[2].matches(isDouble) && inputArr[3].matches(isDouble)) {
            return true;
        }
        else {
            System.out.println("Incorrect input is entered!!!");
            return false;
        }
    }
}
