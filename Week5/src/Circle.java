import java.text.DecimalFormat;

public class Circle {
    protected static final double PI = 3.14;
    private double radius = 1.0;
    private String color = "red";
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return radius * radius * PI;
    }
    public String toString() {
        String ret = "Circle[" + "radius=" + Math.round(radius * 100) / 100.0 + "," + "color=" + color + "]";
        return ret;
    }
}
