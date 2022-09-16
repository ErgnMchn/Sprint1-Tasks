package SortingTriangles;

public class Triangle implements BaseTriangle {

    private final String triangleName;
    private final double firstSideLength;
    private final double secondSideLength;
    private final double thirdSideLength;

    public Triangle(String triangleName, double firstSideLength, double secondSideLength, double thirdSideLength) {
        this.triangleName = triangleName;
        this.firstSideLength = firstSideLength;
        this.secondSideLength = secondSideLength;
        this.thirdSideLength = thirdSideLength;
    }
    public double getArea() {
        double semiPerimeter = (firstSideLength + secondSideLength + thirdSideLength) / 2;
        double areaOfTriangle = semiPerimeter * (Math.abs(semiPerimeter - firstSideLength)) * (Math.abs(semiPerimeter - secondSideLength)) * (Math.abs(semiPerimeter - thirdSideLength));
        double result = Math.sqrt(areaOfTriangle);

        return Math.round(result * 100.0) / 100.0;

    }

    @Override
    public String toString() {
        return "[" + triangleName + "]: " + getArea() + "cm";

    }
}
