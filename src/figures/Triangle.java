package figures;

public class Triangle extends Figure {
    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double size) {
        super(size, size);
        this.c = size;
    }

    @Override
    public double area() {
        //Finding semiperimeter:
        double p = (getA() + getB() + c) / 2;
        //Heron's formula:
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - c));
    }
}
