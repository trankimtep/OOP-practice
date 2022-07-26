package timoday.bai1;

import java.util.Scanner;

import timoday.bai1.entity.Fraction;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();
        Fraction fraction3 = new Fraction();

        System.out.println("Enter the first fraction:");
        fraction1.inputFraction(scanner);

        System.out.println("Enter the second fraction:");
        fraction2.inputFraction(scanner);
        
        System.out.println("Enter the third fraction:");
        fraction3.inputFraction(scanner);

        System.out.print("fraction1 + fraction2 = ");
        System.out.println(fraction1.addFraction(fraction2));

        System.out.print("fraction1 * fraction3 = ");
        System.out.println(fraction1.multiplyFraction(fraction3));
    }
}
