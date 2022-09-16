package Number_In_Words;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestClass {

    @Test
    void testConvertNumberToThousand() {
        assertEquals("Two Hundred",NumberToWord.convertNumberToThousand("200"));
        assertEquals("Three Hundred FiftyFive",NumberToWord.convertNumberToThousand("355"));

    }
    @Test
    void testBigNumberToMillion(){
        LargerNumbers largerNumbers = new LargeNumberImpl();
        String expected = largerNumbers.bigNumberToMillion("500112");
        assertEquals("Five Hundred thousand One Hundred Twelve",expected);
    }
    @Test
    void testBigNumberToBillion(){
        LargeNumberImpl largeNumber = new LargeNumberImpl();
        String expected = largeNumber.bigNumberToBillion("100000000");
        assertEquals("One Hundredmillion",largeNumber.bigNumberToBillion("100000000"));

    }
}