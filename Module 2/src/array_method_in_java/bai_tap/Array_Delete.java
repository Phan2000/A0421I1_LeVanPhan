package array_method_in_java.bai_tap;

import java.util.*;

public class Array_Delete {
    public static void main(String[] args) {
        int n, i, cnt;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter the number of elements in the array: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] array = new int[n];

        System.out.println("Enter elements for array: ");
        for (i = 0; i < n; i++) {
            System.out.printf("Enter the th element array[%d] :  " , i);
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the element you want to delete: ");
        int elementDel = scanner.nextInt();

        for (cnt = i = 0; i < n; i++) {
            if (array[i] != elementDel) {
                array[cnt] = array[i];
                cnt++;
            }
        }
        n = cnt;

        System.out.printf("Array left after removing %d is: " , elementDel);
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
