package timoday.bai16.entity;

public class Circle {
    private Point center;
    private int radius;

    public Circle() {}

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Circle(int radius, Point center) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double perimeter() {
        double rad = (double) radius;
        return (rad * 2 * 3.14);
    }

    public double area () {
        double rad = (double) radius;
        return (rad * rad * 3.14);
    }

    @Override
    public String toString() {
        return ("Dien tich hinh tron la: " + area() + "\n" +
                "Chu vi hinh tron la: " + perimeter() + "\n");
    }
}
