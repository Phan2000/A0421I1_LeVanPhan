package Introduction_to_Java.Thuc_Hanh;

import java.util.*;

public class rectangular_area {
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
