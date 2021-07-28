package opp_in_java.bai_tap.build_class_quadratic_equation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QuadraticEquation s = new QuadraticEquation();
        System.out.print("Enter a : ");
        double a = scanner.nextDouble();
        System.out.print("Enter b : ");
        double b = scanner.nextDouble();
        System.out.print("Enter c : ");
        double c = scanner.nextDouble();

        s.setA(a);
        s.setB(b);
        s.setC(c);

        double delta = s.getDiscriminant();


        if (delta > 0 ) {
            double r1 = s.getRoot1();
            double r2 = s.getRoot2();
            System.out.printf("The equation has 2 roots : \nX1 = %f\nX2 = %f",r1,r2);
        }
        else if (delta == 0) {
            double r = s.getRoot();
            System.out.printf("The equation has only root : X = %f",r);
        }
        else {
            System.out.print("Sorry. The equation has no roots ! ");
        }

    }
}