package array_in_java.thuc_hanh;

import java.util.*;

public class find_min_inArray {
    public static void main(String[] args) {
        int[] arrayNum = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arrayNum.length; i++)
        {
            System.out.printf("Element %d : ", i);
            arrayNum[i] = scanner.nextInt();
        }

        int min = findMin(arrayNum);
        System.out.printf("Min in array is : %d ", min);
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int element : array){
            if(min > element){
                min = element;
            }
        }
        return min;
    }
}
