package array_method_in_java.bai_tap;

import java.util.*;

public class Sum_Element_In_Column {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[][] array = new float[3][3];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j< array[i].length; j++){
                System.out.printf("Enter your element [%d][%d] : ",i,j);
                array[i][j] = scanner.nextFloat();
            }
        }
        System.out.println("Enter your column want to delete : ");
        int col = scanner.nextInt();

        float result = sumColumn(array,col);
        System.out.printf("Sum is : %f",result);
    }

    public static float sumColumn(float[][] array , int column){
        float sum = 0;
        for (float[] floats : array) {
            sum += floats[column];
        }
        return sum;
    }
}
