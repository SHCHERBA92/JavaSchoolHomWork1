package Figurs;

public class Rectangle implements Figure{

    private double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle() {
    }

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

    @Override
    public double perimeter() {
        return this.a + this.b;
    }

    @Override
    public double area() {
        return this.a * this.b;
    }
}
