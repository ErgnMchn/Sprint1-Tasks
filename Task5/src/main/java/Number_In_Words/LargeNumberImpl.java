package Number_In_Words;

public class LargeNumberImpl implements LargerNumbers{
    public String bigNumberToMillion(String number){
        String thousand = "thousand";
        String numberToMillion = "";
        String[] arrNumber = number.split("");
        long numberToInt = Long.parseLong(number);
        long leftNumber = numberToInt % 1000;
        if(number.length()==4){
           numberToMillion = NumberToWord.convertNumberToThousand(arrNumber[0]) + " " + thousand;
            if(leftNumber != 0){
                numberToMillion += " " + NumberToWord.convertNumberToThousand(String.valueOf(leftNumber));
            }
            return numberToMillion;
        }
        else if(number.length()==5){
            numberToMillion = NumberToWord.convertNumberToThousand(arrNumber[0] + arrNumber[1]) + thousand;
            if(leftNumber != 0){
                numberToMillion += " " + NumberToWord.convertNumberToThousand(String.valueOf(leftNumber));
            }
            return numberToMillion;
        }
        else if(number.length()==6){
            numberToMillion = NumberToWord.convertNumberToThousand(arrNumber[0] + arrNumber[1] +arrNumber[2]) + thousand;
            if(leftNumber != 0){
                numberToMillion += " " + NumberToWord.convertNumberToThousand(String.valueOf(leftNumber));
            }
            return numberToMillion;
        }
        return numberToMillion;

    }
    public String bigNumberToBillion(String number){
        String million = "million";
        String numberToBillion = "";
        String[] arrNumber = number.split("");
        long numberToInt = Long.parseLong(number);
        long leftNumber = numberToInt % 1000000;
        if(number.length()==7){
            numberToBillion = NumberToWord.convertNumberToThousand(arrNumber[0]) + " " + million;
            if(leftNumber != 0 && leftNumber<1000){
                numberToBillion += " " + NumberToWord.convertNumberToThousand(String.valueOf(leftNumber));
            } else if(leftNumber != 0 && leftNumber>1000){
                numberToBillion += " " + bigNumberToMillion(String.valueOf(leftNumber));
            }
            return numberToBillion;
        }
        if(number.length()==8){
            numberToBillion = NumberToWord.convertNumberToThousand(arrNumber[0] + arrNumber[1]) + " " +million;
            if(leftNumber != 0 && leftNumber<1000){
                System.out.print(" " + NumberToWord.convertNumberToThousand(String.valueOf(leftNumber)));
            } else if(leftNumber != 0 && leftNumber>1000){
                numberToBillion += " " + bigNumberToMillion(String.valueOf(leftNumber));
            }
            return numberToBillion;
        }
        else if(number.length()==9){
            numberToBillion = NumberToWord.convertNumberToThousand(arrNumber[0] + arrNumber[1] + arrNumber[2]) + " " + million;
            if(leftNumber != 0 && leftNumber<1000){
                System.out.print(" " + NumberToWord.convertNumberToThousand(String.valueOf(leftNumber)));
            } else if(leftNumber != 0 && leftNumber>1000){
                numberToBillion += " " + bigNumberToMillion(String.valueOf(leftNumber));
            }
            return numberToBillion;
        }
        return numberToBillion;
    }
}
