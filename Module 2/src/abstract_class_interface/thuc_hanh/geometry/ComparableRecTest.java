package abstract_class_interface.thuc_hanh.geometry;

import java.util.Arrays;

public class ComparableRecTest {
    public static void main(String[] args) {
        ComparableRectangle[] rectangles = new ComparableRectangle[2];
        rectangles[0] = new  ComparableRectangle(5.5,8.5);
        rectangles[1] = new  ComparableRectangle(3.5,5,"Green",false);

        System.out.println("Pre-sorted:");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Arrays.sort(rectangles);

        System.out.println("After-sorted:");
        for (ComparableRectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        int compare = rectangles[0].compareTo(rectangles[1]);
        System.out.println(compare);

    }
}
