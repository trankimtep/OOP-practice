package timoday.bai11;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        while (true){
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Nhap van ban moi:");
            Text text = new Text(scanner.nextLine());

            System.out.println("So tu cua van ban la: " + text.countWord());

            System.out.println("So ki tu H la: " + text.coutHCharacter());

            System.out.println("Xau da chuan hoa la: " + text.standardized());
        }
        
    }
}
