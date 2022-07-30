package timoday.bai15.entity;

public class Triangle15 {
    private Point x;
    private Point y;
    private Point z;

    public Triangle15() {}

    public Triangle15(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public Point getZ() {
        return z;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    public boolean isTriangle() {
        double a = x.distanceFrom(y);
        double b = y.distanceFrom(z);
        double c = z.distanceFrom(x);
        return  (a + b > c) && 
                (a + c > b) && 
                (b + c > a);
    }

    public double perimeter15() {
        return x.distanceFrom(y) + x.distanceFrom(z) + y.distanceFrom(z);
    }

    public double area15() {
        double p = perimeter15()/2;
        return (p - x.distanceFrom(z));
        //return (Math.sqrt(p * (p - x.distanceFrom(y)) * (p - x.distanceFrom(z)) * (p - y.distanceFrom(z))));
    }

}
