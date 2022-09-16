package SortingTriangles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateInputTest {
    @Test
    void testInputIsValid(){

        assertTrue(ValidateInput.inputIsValid("Triangle5,10,20,35"));
        assertTrue(ValidateInput.inputIsValid("new Triangle,10.5,30,20"));
        assertFalse(ValidateInput.inputIsValid("Triangle,a,2,3"));
        assertFalse(ValidateInput.inputIsValid("Triangle,a,a,a"));

    }

}