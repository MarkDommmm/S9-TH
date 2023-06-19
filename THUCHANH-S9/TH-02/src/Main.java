import RA.*;

import java.util.Arrays;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("indigo",false,3.5);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle comparableCircle: circles) {
            System.out.println(comparableCircle);
        }
        Arrays.sort(circles);

        System.out.println("After - sorted");
        for (ComparableCircle comparableCircle:circles) {
            System.out.println(comparableCircle);
        }
    }
}