public class Main {
    public static void main (String[] args) {
        Circle c = new Circle(3.0);
        System.out.println(c.getArea());
        System.out.println(c.toString());
        Cylinder c2 = new Cylinder(3.4234320, 3.32132131);
        System.out.println(c2.toString());
        System.out.println(c2.getVolume());
    }
}
