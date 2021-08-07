package abstract_class_interface.thuc_hanh.comparator;

import abstract_class_interface.thuc_hanh.geometry.Circle;
import java.util.Comparator;
import java.util.Arrays;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[2];
        circles[0] = new Circle(5.5);
        circles[1] = new Circle(4.5,"Yellow",false);
        System.out.println("Pre-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Comparator comparatorCircle = new ComparatorCircle();
        Arrays.sort(circles, comparatorCircle);

        System.out.println("After-sorted:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Circle c1 = new Circle(6.5);
        Circle c2 = new Circle(5.5);
        int result = comparatorCircle.compare(c1,c2);
        System.out.println(result);
    }
}
