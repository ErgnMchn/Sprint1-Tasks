package Number_In_Words;

public class NumberToWord {
    public static String convertNumberToThousand(String input) {
        String numberToWord = "";
        String[] newArr = null;
        int number = Integer.parseInt(input);
        String[] inputArr = input.split("");
        String[] oneDigit = new String[]{"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] twoDigits = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};
        String[] multipleOftens = new String[]{"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] powerOftens = new String[]{"Hundred"};


        if (inputArr.length == 3) {
            int leftNumber = number % 100;
            numberToWord = oneDigit[Integer.parseInt(inputArr[0])] + " " + powerOftens[0];
            if (leftNumber != 0 && leftNumber < 10) {
                numberToWord += " " + oneDigit[leftNumber];
                return numberToWord;
            } else if (leftNumber != 0 && leftNumber >= 10 && leftNumber<20) {
                numberToWord += " " + twoDigits[Integer.parseInt(inputArr[2])];
                return numberToWord;
            } else if (leftNumber != 0 && leftNumber >= 20) {
                numberToWord += " " + multipleOftens[Integer.parseInt(inputArr[1])] + " " + oneDigit[Integer.parseInt(inputArr[2])];
                return numberToWord;
            }
            return numberToWord;
        }
       else if (inputArr.length == 2) {
            int leftNumber2 = number % 100;

            if (leftNumber2 != 0 && leftNumber2 < 10) {
                numberToWord += oneDigit[leftNumber2];
                return numberToWord;
            } else if (leftNumber2 != 0 && leftNumber2 >= 10 && leftNumber2<20 ) {
                numberToWord += twoDigits[Integer.parseInt(inputArr[1])];
                return numberToWord;
            } else if (leftNumber2 != 0 && leftNumber2 >= 20) {
                numberToWord += multipleOftens[Integer.parseInt(inputArr[0])] + " " + oneDigit[Integer.parseInt(inputArr[1])];
                return numberToWord;
            } else {
                numberToWord += twoDigits[Integer.parseInt(inputArr[0])];
                return numberToWord;
            }
        }
       else  if (inputArr.length == 1) {
            int leftNumber1 = number % 10;

            if (leftNumber1 != 0) {
                numberToWord += oneDigit[leftNumber1];
                return numberToWord;
            } else {
                numberToWord += "Zero";
                return numberToWord;
            }
        }
        return numberToWord;

    }
    }
