public class Cylinder extends Circle {
    private double height = 1.0;
    public Cylinder() {}
    public Cylinder(double radius) {
        super(radius);
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea() {
        return super.getArea() * 2 + height * super.getRadius() * 2 * PI;
    }
    public double getVolume() {
        return height * super.getArea();
    }
    public String toString() {
        String ret = "Cylinder[" + super.toString() + "," + "height=" + Math.round(height * 100) / 100.0 + "]";
        return ret;
    }
}
