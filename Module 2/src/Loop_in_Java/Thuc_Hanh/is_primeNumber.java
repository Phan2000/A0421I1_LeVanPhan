package loop_in_java.thuc_hanh;

import java.util.*;

public class is_primeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = scanner.nextInt();
        boolean flag = true;
        if (number < 2){
            flag = false;
        }else {
            for (int i = 2; i < number-1; i++){
                if ((number%i) == 0){
                    flag = false;
                    break;
                }
            }
        }
        if (flag){
            System.out.printf("Number %d is prime number !",number);
        }else {
            System.out.printf("Number %d isn't prime number !",number);
        }
    }
}
