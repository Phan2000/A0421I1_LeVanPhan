package exceptions_debug.thuc_hanh;

import java.util.Scanner;

public class CalculationExample {
      static Scanner scanner = new Scanner(System.in);
      public static void main(String[] args) {
        
            System.out.println("Hãy nhập x: ");
            int x = scanner.nextInt();
            System.out.println("Hãy nhập y: ");
            int y = scanner.nextInt();
            CalculationExample calc = new CalculationExample();
            calc.calculate(x, y);

    }

      private void calculate(int x, int y) {
            try {
                  int a = x + y;
                  int b = x - y;
                  int c = x * y;
                  int d = x / y;
                  System.out.println("Tổng x + y = " + a);
                  System.out.println("Hiệu x - y = " + b);
                  System.out.println("Tích x * y = " + c);
                  System.out.println("Thương x / y = " + d);
            } catch (ArithmeticException e) {
                  System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
            }
      }
}