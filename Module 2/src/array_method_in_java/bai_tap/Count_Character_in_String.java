package array_method_in_java.bai_tap;

import java.util.*;

public class Count_Character_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string :");
        String string = scanner.nextLine();
        System.out.println("Enter the character you want to count:");
        char character = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < string.length() ; i++) {
            if (character == string.charAt(i)){
                count++;
            }
        }
        System.out.printf("The number of occurrences of a character in a string is %d",count);
    }
}
