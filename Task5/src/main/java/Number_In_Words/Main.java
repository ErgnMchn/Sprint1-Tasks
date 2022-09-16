package Number_In_Words;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exit = false;
        System.out.println("Welcome to the NumberToWord program.");
        while(!exit) {
            System.out.println("Please enter positive digit to one billion that you want to convert.");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            input.trim();
            LargerNumbers largerNumbers = new LargeNumberImpl();
            ValidateInput validateInput = new ValidateInputImpl();
            if (validateInput.checkValidityOfInput(input)) {
                    exit = false;
            } else{
                continue;
            }
            if (input.length() <= 3) {
                System.out.println(NumberToWord.convertNumberToThousand(input));
            } else if (input.length() < 7) {
                System.out.println(largerNumbers.bigNumberToMillion(input));
            } else if (input.length() < 10 && input.length() > 6) {
                System.out.println(largerNumbers.bigNumberToBillion(input));
            } else {
                System.out.println("The given number is too long.");
            }
            break;
        }
    }
}
