package Figurs;

public class Sqeue extends Rectangle{
    private double a;

    public Sqeue(double side)
    {
        super(side,side);
        this.a = side;
    }

    @Override
    public double getA() {

        return a;
    }

    @Override
    public void setA(double a) {
        this.a = a;
        super.setB(a);
    }

    @Override
    public void setB(double b) {
        this.a = b;
        super.setA(b);
    }
}
