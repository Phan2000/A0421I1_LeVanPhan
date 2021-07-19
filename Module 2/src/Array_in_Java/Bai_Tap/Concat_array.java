package array_in_java.bai_tap;

import java.util.*;

public class Concat_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        for (int i = 0; i < array1.length;i++){
            System.out.printf("Enter element %d of array 1 : ",i);
            array1[i] = scanner.nextInt();
            System.out.printf("Enter element %d of array 2 : ",i);
            array2[i] = scanner.nextInt();
        }

        concat(array1,array2);
    }

    public static void concat(int[] array1, int[] array2){
        int length3 = array1.length + array2.length;
        int[] array3 = new int[length3];
        int count = 0;

        for (int element : array1) {
            array3[count] = element;
            count++;
        }

        for (int element : array2) {
            array3[count] = element;
            count++;
        }

        System.out.println(Arrays.toString(array3));
    }
}
