package Array_in_Java.Bai_Tap;

import java.util.*;

public class min_in_array {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

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

        int minInArray = findMin(array);
        System.out.printf("Min value in array is : %d ",minInArray);
    }

    public static int findMin(int[][] array){
        int min = array[0][0];
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (min > anInt) {
                    min = anInt;
                }
            }
        }
        return min;
    }
}
