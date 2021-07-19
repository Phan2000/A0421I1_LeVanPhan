package loop_in_java.thuc_hanh;

import java.util.*;

public class greatest_common_divisor {
    //ước chung max;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = input.nextInt();
        System.out.println("Enter b: ");
        int b = input.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.printf("Greatest common factor: %d" , a);
    }

}
