import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean exitProgram = false;
        boolean InputIsValid = false;
        String[] arr = new String[4];
        while (!exitProgram) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter the first envelope height");
            while (!InputIsValid) {
                String input = scan.nextLine();
                if (InputValidity.checkValidityFirstEnvelopeHeight(input)) {
                    InputIsValid = true;
                    arr[0]=input;
                }
            }
            System.out.println("please enter the first envelope width");
            while (InputIsValid) {
                String input = scan.nextLine();
                if (InputValidity.checkValidityFirstEnvelopeWidth(input)) {
                    InputIsValid = false;
                    arr[1]=input;
                }
            }
            System.out.println("please enter the second envelope height");
            while (!InputIsValid) {
                String input = scan.nextLine();
                if (InputValidity.checkValiditySecondEnvelopeHeight(input)) {
                    InputIsValid = true;
                    arr[2] = input;
                }
            }
            System.out.println("please enter the second envelope width");
            while (InputIsValid) {
                String input = scan.nextLine();
                if (InputValidity.checkValiditySecondEnvelopeWidth(input)) {
                    InputIsValid = false;
                    arr[3] = input;
                }
            }

            System.out.println("If you want to continue please type y or yes and press enter.Otherwise the program will be terminated");
            String input = scan.nextLine();
            input = input.trim();
            if (input.equals("yes") | input.equals("y")) {
                exitProgram = false;
            } else {
                exitProgram = true;
            }

        }
        double firstEnvelopeHeight = Double.parseDouble(arr[0]);
        double firstEnvelopeWidth = Double.parseDouble(arr[1]);
        double secondEnvelopeHeight = Double.parseDouble(arr[2]);
        double secondEnvelopeWidth = Double.parseDouble(arr[3]);
        Envolope analyse = new Envolope(firstEnvelopeHeight,firstEnvelopeWidth,secondEnvelopeHeight,secondEnvelopeWidth);
        analyse.printResultOfAnalysis();
    }
}
