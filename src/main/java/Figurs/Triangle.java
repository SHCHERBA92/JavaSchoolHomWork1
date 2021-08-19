package Figurs;

public class Triangle implements Figure{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double perimeter() {
        return (this.a + this.b + this.c);
    }

    @Override
    public double area() {
        double res = Math.sqrt(perimeter()/2 * ((perimeter()/2) - this.a) * ((perimeter()/2) - this.b) * ((perimeter()/2) - this.c) );
        return res;
    }
}
