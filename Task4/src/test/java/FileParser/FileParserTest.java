package FileParser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileParserTest {
    String fileLocation = "C:\\SoffServe\\GitNewRepository\\Tasks\\Task4\\src\\test\\java\\Java.txt";

    @Test
    void testGetNumberOfOccurrences() {
        String stringToCount = "Jav";
        long expectedResult = FileParser.getNumberOfOccurrences(fileLocation, stringToCount);
        assertEquals(2, expectedResult);
    }

    @Test
    void testReplaceString() {
        String oldOne = "make";
        String newOne = "makes";

        FileParser.replaceString(fileLocation, oldOne, newOne);
        assertEquals(2, FileParser.getNumberOfOccurrences(fileLocation, newOne));
        FileParser.replaceString(fileLocation, newOne, oldOne);
    }
}