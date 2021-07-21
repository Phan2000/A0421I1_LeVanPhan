package array_in_java.bai_tap;

import java.util.*;

public class Sum_element_in_main_cross {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the rank of the matrix: ");
        n = scanner.nextInt();

        int[][] matrixA = new int[n][n];

        System.out.println("Enter the element for matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + "\t");
            }
            System.out.println("\n");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    sum += matrixA[i][j];
                }
            }
        }

        System.out.println("Sum = " + sum);
    }
}
