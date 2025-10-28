package _20_Casting.Shape;

public class Rectangle extends Shape{
    public double h;
    public double w;

    public Rectangle(double w, double h) {
        this.h =h;
        this.w =w;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    protected void drawInternal() {

    }
}
