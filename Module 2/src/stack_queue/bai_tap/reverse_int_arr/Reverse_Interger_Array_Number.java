package stack_queue.bai_tap.reverse_int_arr;

import java.util.Stack;

public class Reverse_Interger_Array_Number {
    public static void main(String[] args) {
        Stack<Integer> wStack = new Stack<>();
        int[] arrayNumber = {1,2,3,4,5};

        for (int i = 0; i < arrayNumber.length; i++) {
            wStack.push(arrayNumber[i]);
        }

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = wStack.pop();
        }

        for (int i : arrayNumber) {
            System.out.print(i);
        }
    }
}
