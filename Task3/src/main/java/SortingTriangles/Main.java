package SortingTriangles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String[] inputToArray;

    public static void main(String[] args) {
        boolean exit = false;
       List<Triangle> triangles = new ArrayList<>();

        while (!exit) {
            System.out.println("Please enter the name of the triangle and length of its sizes with separator comme");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            input = input.trim();
            if (!ValidateInput.inputIsValid(input)) {
                continue;
            }

            inputToArray = input.split(",");
            String triangleName = inputToArray[0].trim();
            double firstSideLength = Double.parseDouble(inputToArray[1].trim());
            double secondSideLength = Double.parseDouble(inputToArray[2].trim());
            double thirdSideLength = Double.parseDouble(inputToArray[3].trim());

            triangles.add(new Triangle(triangleName, firstSideLength, secondSideLength, thirdSideLength));

            System.out.println("if you want to add another triangle please write y or yes or if you want to terminate the program pls write any other letter ");
            String inputToContinue = scan.nextLine();
            inputToContinue = inputToContinue.trim().toLowerCase();

            exit = inputToContinue.equals("y") || inputToContinue.equals("yes") ? false : true;

        }

        List<Triangle> sortedTriangles = SortTriangles.sortTrianglesDescendingOrder(triangles);

        for (int i = 1; i <= sortedTriangles.size(); i++) {
            System.out.println(i + ". " + sortedTriangles.get(i - 1));
        }
    }
}
