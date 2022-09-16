package SortingTriangles;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortTrianglesTest {
    @Test
    void testSort() {
        List<Triangle> trianglesAreas = new ArrayList<>();
        trianglesAreas.add(new Triangle("triangle",1,15,12));
        trianglesAreas.add(new Triangle("triangle1",20.5,5.7,30.5));
        trianglesAreas.add(new Triangle("triangle3",9,15.5,1));

        List<Triangle> sortedTriangles = SortTriangles.sortTrianglesDescendingOrder(trianglesAreas);

        assertEquals(104.1, sortedTriangles.get(0).getArea());
        assertEquals(39.31, sortedTriangles.get(1).getArea());
        assertEquals(19.08, sortedTriangles.get(2).getArea());
    }

}