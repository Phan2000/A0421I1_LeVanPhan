package array_method_in_java.thuc_hanh;

import java.util.*;

public class Reverse_Array {
    public static void main(String[] args) {
        int count, i=0, j=0, temp;
        int[] number = new int[20];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element of array: ");
        count = scanner.nextInt();
        for(i=0; i<count; i++)
        {
            System.out.printf("Element %d : ", i);
            number[i] = scanner.nextInt();
        }
        j = count - 1;
        i = 0;

        while(i<j)
        {
            temp = number[i];
            number[i] = number[j];
            number[j] = temp;
            i++;
            j--;
        }
        System.out.print("Array after reverse: ");
        for(i=0; i<count; i++)
        {
            System.out.print(number[i]+ "  ");
        }
    }
}
