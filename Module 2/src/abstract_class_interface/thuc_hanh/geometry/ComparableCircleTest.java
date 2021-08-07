package abstract_class_interface.thuc_hanh.geometry;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[2];
        circles[0] = new ComparableCircle(6.5);
        circles[1] = new ComparableCircle(4.5,"Red",false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        int result = circles[0].compareTo(circles[1]);
        System.out.println(result);
    }
}
