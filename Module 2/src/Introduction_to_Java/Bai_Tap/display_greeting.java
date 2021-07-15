package Introduction_to_Java.Bai_Tap;
import java.util.Scanner;

public class display_greeting {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name :");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}