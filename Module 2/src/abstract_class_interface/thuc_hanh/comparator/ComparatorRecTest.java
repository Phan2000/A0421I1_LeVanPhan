package abstract_class_interface.thuc_hanh.comparator;

import abstract_class_interface.thuc_hanh.geometry.Rectangle;
import java.util.*;

public class ComparatorRecTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle(3.5,4.5);
        rectangles[2] = new Rectangle(5.5,6.5,"Red",false);

        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Comparator comparatorRectangle = new ComparatorRectangle();
        Arrays.sort(rectangles, comparatorRectangle);

        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Rectangle r1 = new Rectangle(4.4,5.5);
        Rectangle r2 = new Rectangle(1.2,3.5);

        int result = comparatorRectangle.compare(r1,r2);
        System.out.println(result);
    }
}
