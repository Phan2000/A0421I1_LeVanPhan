package exceptions_debug.thuc_hanh;

import java.util.Scanner;

public class DebugAppJava {
      static Scanner scanner = new Scanner(System.in);
      public static void main(String[] args) {
            System.out.println("Linear Equation Resolver");
            System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

            try{
                  System.out.print("a: ");
                  double a = scanner.nextDouble();

                  System.out.print("b: ");
                  double b = scanner.nextDouble();
                  if (a != 0) {
                  double solution = -b / a;
                  System.out.printf("The solution is: %f!", solution);
                  } else {
                        if (b == 0) {
                              System.out.print("The solution is all x!");
                        } else {
                              System.out.print("No solution!");
                        }
                  }
            }
            catch(Exception exception){
                  System.out.println(exception);
            }
            System.out.println("Done");
      }
}
