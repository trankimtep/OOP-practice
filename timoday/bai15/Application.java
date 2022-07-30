package timoday.bai15;

import java.util.Scanner;

import timoday.bai15.entity.Triangle15;
import timoday.bai15.entity.Point;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Point X: ");
        Point x = new Point(scanner.nextDouble(), scanner.nextDouble());
        
        System.out.print("Point Y: ");
        Point y = new Point(scanner.nextDouble(), scanner.nextDouble());


        System.out.print("Point Z: ");
        Point z = new Point(scanner.nextDouble(), scanner.nextDouble());

        Triangle15 triangle15 = new Triangle15(x, y, z);

        if (triangle15.isTriangle()) {
            System.out.println("Dien tich tam giac la: " + triangle15.area15());
            System.out.println("Chu vi tam giac la: " + triangle15.perimeter15());
        } else {
            System.out.println("Tam giac khong hop le!!!!");
        }        
    }
}
