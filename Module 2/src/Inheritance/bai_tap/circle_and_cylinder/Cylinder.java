// package Inheritance.bai_tap.circle_and_cylinder;

public class Cylinder extends Circle {

    private double height = 1.0;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height){
        super(radius,color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea() *height;
    }

    @Override
    public String toString(){
        return "\nRadius = " + getRadius() + "\nColor :" + getColor() + "\nHeight = " + height + "\nVolume = " + getVolume(); 
    }
}