import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class EnvolopeTest {
    @Test
    @DisplayName("Inputs are assigned correctly")
    void testInputIsAssignedCorrectly(){
        Envolope envolope= new Envolope(5, 5,11,11.5);
        assertEquals(5, envolope.getFirstEnvelopeHeight());
        assertEquals(5, envolope.getFirstEnvelopeWidth());
        assertEquals(11,envolope.getSecondEnvelopeHeight());
        assertEquals(11.5,envolope.getSecondEnvelopeWidth());

    }
   @Test
    void test_printResultOfAnalysisOutput_EnvelopeCanFit(){
       ByteArrayOutputStream outContent = new ByteArrayOutputStream();
       System.setOut(new PrintStream(outContent));
       Envolope envolope= new Envolope(5, 5,11,11.5);
       envolope.printResultOfAnalysis();
       String expectedOutput = "first envelope can fit into the second envelope" + System.lineSeparator();
       assertEquals(expectedOutput,outContent.toString());

   }
   @Test
    void test_PrintResultOfAnalysisOutput_EnvelopeCannotFit(){
       ByteArrayOutputStream outContent = new ByteArrayOutputStream();
       System.setOut(new PrintStream(outContent));
       Envolope envolope= new Envolope(7, 9,8,11.5);
       envolope.printResultOfAnalysis();
       String expectedOutput = "the first envelope cannot fit into the second envelope" + System.lineSeparator();
       assertEquals(expectedOutput,outContent.toString());
   }



}