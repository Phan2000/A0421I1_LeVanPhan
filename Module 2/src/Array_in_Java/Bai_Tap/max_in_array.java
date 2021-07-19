package array_in_java.bai_tap;

import java.util.*;

public class max_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of rows: ");
        int m = scanner.nextInt();
        System.out.print("Enter amount of cols: ");
        int n = scanner.nextInt();
        int[][] array = new int[m][n];

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.printf("Enter the element[%d][%d] of array: ",i,j);
                array[i][j]= scanner.nextInt();
            }
        }

        int maxInArray = findMax(array);
        System.out.printf("Max value in array is : %d ",maxInArray);
    }

    public static int findMax(int[][] array){
        int max = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
