package timoday.bai12;

import java.util.Scanner;

import timoday.bai12.entiry.Matrix;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix A: ");
        Matrix matrixA = new Matrix();
        matrixA.inputMatrix(scanner);

        System.out.println("Enter matrix B: ");
        Matrix matrixB = new Matrix();
        matrixB.inputMatrix(scanner);
        
        System.out.println("The result matrix is: ");
        System.out.println(matrixA.add(matrixB));
    }
}
