package Array_in_Java.Bai_Tap;

import java.util.*;

public class add_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int [] arr = new int [n];
        System.out.print("Enter elements for array: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the element you want to add : ");
        int elementAdd = scanner.nextInt();
        System.out.printf("\nAdd element %d to array.", elementAdd);
        arr = addElement(arr, elementAdd);
        System.out.print("\nArray after add : ");
        displayArray(arr);
    }


    public static int [] addElement(int [] arr, int x) {
        int arrIndex = arr.length - 1;
        int tempIndex = arr.length;
        int [] tempArr = new int [tempIndex + 1];
        boolean flag = false;

        for (int i = tempIndex; i >= 0; i--) {
            if (!flag) {
                tempArr[i] = x;
                flag = true;
            } else {
                tempArr[i] = arr[arrIndex--];
            }
        }
        return tempArr;
    }

    public static void displayArray(int [] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
