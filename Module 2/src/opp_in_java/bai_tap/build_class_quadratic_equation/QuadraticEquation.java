package opp_in_java.bai_tap.build_class_quadratic_equation;

public class QuadraticEquation {
    private double a,b,c;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (b*b)-(4*a*c);
    }

    public double getRoot1(){
        return ((-b) + Math.pow(getDiscriminant(),0.5))/2*a;
    }


    public double getRoot2(){
        return ((-b) - Math.pow(getDiscriminant(),0.5))/2*a;
    }


    public double getRoot(){
        return (-b)/2*a;
    }
}
