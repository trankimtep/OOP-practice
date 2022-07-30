package timoday.bai14.entity;

import java.util.Scanner;

public class Polygon {
    protected int edgeNumber;
    protected double[] edges;

    public Polygon() {}

    public Polygon(int edgeNumber, double [] edges) {
        this.edgeNumber = edgeNumber;
        this.edges = edges;
    }

    public int getEdgeNumber() {
        return edgeNumber;
    }

    public void setEdgeNumber(int edgeNumber) {
        this.edgeNumber = edgeNumber;
    }

    public double[] getEdges() {
        return edges;
    }

    public void setEdges(double[] edges) {
        this.edges = edges;
    }

    public double perimeter() {
        int sumOfEdge = 0;
        for (int i = 0; i < edges.length; i++) {
            sumOfEdge += edges[i];
        }
        return sumOfEdge; 
    }

    public void enterEdges(Scanner scanner) {
        for (int i = 0; i < edgeNumber; i++) {
            edges[i] = scanner.nextInt();
        }
    }

    @Override
    public String toString() {
        String result = "[ ";
        for (int i = 0; i < edges.length; i++){
            result += edges[i] + " ";
        }
        result += "]";
        return result;
    }

}
