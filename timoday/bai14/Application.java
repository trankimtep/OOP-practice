package timoday.bai14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import timoday.bai14.entity.Triangle;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        
        System.out.print("So tam giac muon nhap vao: ");
        int numberTriangles = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numberTriangles; i++) {
            System.out.println("Tam giac " + (i + 1) + ": ");
            Triangle triangle1 = new Triangle();
            triangle1.enterEdges(scanner);
            triangles.add(triangle1);    
        }

        Collections.sort(triangles);

        System.out.println("Tam giac co dien tich lon nhat la: " + triangles.get(0));
        System.out.println("Dien tich tam giac do la: " + triangles.get(0).area());
    }
}

