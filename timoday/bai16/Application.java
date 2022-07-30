package timoday.bai16;

import java.util.Scanner;

import timoday.bai16.entity.Point;
import timoday.bai16.entity.Circle;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Toa do tam: ");
        Point center = new Point(scanner.nextDouble(), scanner.nextDouble());

        System.out.print("Ban kinh: ");
        int radius = scanner.nextInt();

        Circle circle = new Circle(center, radius);

        System.out.println(circle);
    }
}
