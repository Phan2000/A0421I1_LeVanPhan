package array_in_java.thuc_hanh;

import java.util.Scanner;

public class find_max_inArray {
    public static void main(String[] args) {
        int[] arrayNum = new int[6];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arrayNum.length; i++)
        {
            System.out.printf("Element %d : ", i);
            arrayNum[i] = scanner.nextInt();
        }

        int max = findMax(arrayNum);
        System.out.printf("Max in array is : %d ", max);
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int element : array){
            if(max < element){
                max = element;
            }
        }
        return max;
    }

}
