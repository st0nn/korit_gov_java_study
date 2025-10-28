package _20_Casting.Shape;

public class Circle extends Shape{
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public Circle() {
    }

    @Override
    public double area() {
        return 3.14*r*r;
    }
    @Override
    protected void drawInternal() {

    }
}
