package Bai_Tap;

import java.util.Scanner;

public class number_to_word {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter number here: ");
        int number = scanner.nextInt();
        numberToWord(number);
    }
    public static void numberToWord(int number){
        String[] arr = {
                " Zeros",
                " one",
                " two",
                " three",
                " four",
                " five",
                " six",
                " seven",
                " eight",
                " nine",
                " ten",
                " eleven",
                " twelve",
                " thirteen",
                " fourteen",
                " fifteen",
                " sixteen",
                " seventeen",
                " eighteen",
                " nineteen",
                " Twenty"
        };
        for(int i=0 ; i<=arr.length; i++){
            if(number == i){
                System.out.println("Number after convert is : " + arr[i]);
            }
        }
    }
}