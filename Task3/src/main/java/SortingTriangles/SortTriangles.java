package SortingTriangles;

import java.util.Comparator;
import java.util.List;

public class SortTriangles {
    public static List<Triangle> sortTrianglesDescendingOrder(List<Triangle> triangleList){
        triangleList = triangleList.stream().sorted(Comparator.comparing(Triangle::getArea).reversed()).toList();

        return triangleList;
    }
}
