package introduction_to_java.bai_tap;

import java.util.*;

public class DisplayGreeting {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

}
