package introduction_to_java.thuc_hanh;

import java.util.*;

public class Rectangular_Area {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.printf("Area is: %.2f ",area);
    }
}
