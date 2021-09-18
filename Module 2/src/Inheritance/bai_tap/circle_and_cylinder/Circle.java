package Inheritance.bai_tap.circle_and_cylinder;

public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public Circle(double radius, String color){
        this.color = color;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public String toString(){
        return "\nRadius = " + radius + "\nColor :" + color + "\nArea = " + getArea();        
    }
}