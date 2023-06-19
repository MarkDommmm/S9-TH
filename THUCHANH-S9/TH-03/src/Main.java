import RA.Circle;
import RA.CircleComparator;

import java.util.Arrays;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("indigo", false, 3.5);
        System.out.println("Pre-sorted:");
        for (Circle circle1 : circles) {
            System.out.println(circle1);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }


    }
}