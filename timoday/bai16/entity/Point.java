package timoday.bai16.entity;

public class Point {
    private double X;
    private double Y;

    public Point() {}

    public Point (double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public double getY() {
        return Y;
    }

    public void setY(double y) {
        Y = y;
    }

    public double distanceFrom(Point newPoint) {
        return (Math.sqrt((getX() - newPoint.getX())*(getX() - newPoint.getX()) +
                          (getY() - newPoint.getY())*(getY() - newPoint.getY())));
    }


    @Override
    public String toString() {
        return "(" + X + ", " + Y + ")";
    }
}
