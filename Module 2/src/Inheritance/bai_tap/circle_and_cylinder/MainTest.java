package Inheritance.bai_tap.circle_and_cylinder;


public class MainTest {
    
    public static void main(String[] args) {

        Circle circle = new Circle (4.5,"Green");
        System.out.println(circle.toString());
        System.out.print("=========================================");
        Cylinder cylinder = new Cylinder(2.5,"blue",5.0);
        System.out.println(cylinder.toString());
    }
}