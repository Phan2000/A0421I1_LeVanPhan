package access_modifier_static.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {     
        return radius;
    }

    // public double getArea(){
    //     return Math.PI * Math.pow(radius,2);
    // }

    double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    // protected double getArea(){
    //     return Math.PI * Math.pow(radius,2);
    // }

    // double getArea(){
    //     return Math.PI * Math.pow(radius,2);
    // }
}