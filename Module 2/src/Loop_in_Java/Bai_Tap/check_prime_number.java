package loop_in_java.bai_tap;

import java.util.*;

public class check_prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of numbers you want to check : ");
        int amount = scanner.nextInt();
        for (int i = 0; i < amount; i++){
            boolean flag = true;
            if ( i < 2){
                flag = false;
            }
            else {
                for (int j = 2; j < i-1; j++){
                    if (i % j == 0){
                        flag = false;
                        break;
                    }
                }
            }

            if(flag){
                System.out.println(i + " is prime number ");
            }
        }
    }
}
