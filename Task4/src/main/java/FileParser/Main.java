package FileParser;
import java.io.*;

public class Main {
    private static final String stringToCount = "Jav";
   private static final String stringToSearch = "Java";
   private static final String stringToReplace = "Replaced";

    public static void main(String[] args) throws FileNotFoundException {
        
        String fileLocation = "C:\\SoffServe\\GitNewRepository\\Tasks\\Task4\\src\\main\\java\\FileParser\\Java.txt";
        System.out.println(FileParser.getNumberOfOccurrences(fileLocation,stringToCount));
        FileParser.replaceString(fileLocation,stringToSearch,stringToReplace);
    }
}