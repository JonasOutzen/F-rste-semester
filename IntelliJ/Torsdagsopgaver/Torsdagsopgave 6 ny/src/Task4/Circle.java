package Task4;

public class Circle implements Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
}
