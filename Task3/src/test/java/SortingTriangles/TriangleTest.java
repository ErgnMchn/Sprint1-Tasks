package SortingTriangles;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    @Test
    @DisplayName("Inputs are assigned correctly")
    void testGetArea(){
        Triangle triangle = new Triangle("Triangle1", 5,11,11.5);
        double expectedValue = 27.28;
        assertEquals(expectedValue,triangle.getArea());
    }



}