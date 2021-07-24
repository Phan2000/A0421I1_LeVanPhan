package array_method_in_java.thuc_hanh;

import java.util.*;

public class Count_Students_Pass {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Size should not exceed 30");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int k : array) {
            System.out.print(k + "  ");
            if (k >= 5 && k <= 10)
                count++;
        }
        System.out.print("\nThe number of students passing the exam is: " + count);
    }
}

