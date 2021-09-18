package exceptions_debug.bai_tap;

import java.util.Scanner;

public class Test {
      private static Scanner scanner = new Scanner(System.in);
      public static void main(String[] args) {
      boolean isRight = true;
		  	while(isRight) {
		  		  System.out.println("Enter three side of the triangle: ");
		  		  System.out.print("Side 1 : ");
		  		  double side1 = scanner.nextDouble();
		  		  System.out.print("Side 2 : ");
		  		  double side2 = scanner.nextDouble();
		  		  System.out.print("Side 3 : ");
		  		  double side3 = scanner.nextDouble();

				  try {
					 	Triangle triangle = new Triangle(side1, side2, side3);
					 	isRight = false;

					 	System.out.println(triangle.toString());
					 	System.out.println("- Area: " + triangle.getArea());
					 	System.out.println("- Perimeter: " + triangle.getPerimeter());
				  }
				  catch (IllegalTriangleException e) {
				  		System.out.println(e.getMessage());
				  }
		    }
      }
}
