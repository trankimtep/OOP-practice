package timoday.bai14.entity;

public class Triangle extends Polygon implements Comparable<Triangle>{


    public Triangle() {
        edgeNumber = 3;
        edges = new double[3];
    }

    @Override 
    public double perimeter(){
        return edges[0] + edges[1] + edges[2];
    }

    public boolean isTriangle() {
        return  (edges[0] + edges[1] > edges[2]) && 
                (edges[1] + edges[2] > edges[0]) && 
                (edges[0] + edges[2] > edges[1]);
    }

    public double area() {
        double p = perimeter()/2;
        // return (p);
        return ((p * (p - edges[0]) * (p - edges[1]) * (p - edges[2])));
        //Math.sqrt
    }

    @Override
    public int compareTo(Triangle o) {
        return (int) (o.area() - area());
    }
        

}
