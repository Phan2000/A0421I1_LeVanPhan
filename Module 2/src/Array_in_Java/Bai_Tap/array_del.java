package Array_in_Java.Bai_Tap;

import java.util.*;

public class array_del {

    public static void main(String[] args) {
        int n, i, cnt;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.printf("Enter the number of elements in the array: ");
            n = scanner.nextInt();
        } while (n <= 0);

        int array[] = new int[n];

        System.out.println("Enter elements for array: ");
        for (i = 0; i < n; i++) {
            System.out.printf("Enter the th element array[%d] :  " , i);
            array[i] = scanner.nextInt();
        }

        System.out.printf("Enter the element you want to delete: ");
        int elemenDel = scanner.nextInt();

        for (cnt = i = 0; i < n; i++) {
            if (array[i] != elemenDel) {
                array[cnt] = array[i];
                cnt++;
            }
        }
        n = cnt;

        System.out.printf("Array left after removing %d is: " , elemenDel);
        for (i = 0; i < n; i++) {
            System.out.printf(array[i] + "\t");
        }
    }
}
