package timoday.bai9.management;

import java.util.Date;
// import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import timoday.bai9.entity.LibraryCard;

public class LibraryManagement {
    public static ArrayList<LibraryCard> libraryCards = new ArrayList<LibraryCard>();

    public void addLibraryCard(Scanner scanner) {
        System.out.print("Ten: ");
        String name = scanner.nextLine();

        System.out.print("Ma sinh vien: ");
        String code = scanner.nextLine();

        System.out.print("Ngay sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Lop: ");
        String classs = scanner.nextLine();

        System.out.print("So phieu muon: ");
        String borrowCode = scanner.nextLine();

        System.out.print("Ngay muon: ");
        String borrowDate = scanner.nextLine();

        System.out.print("Ngay tra: ");
        String returnDate = scanner.nextLine();

        System.out.print("So hieu sach: ");
        String bookCode = scanner.nextLine();

        libraryCards.add(new LibraryCard(name, code, dateOfBirth, classs, borrowCode, borrowDate, returnDate, bookCode));
    }

    public void displayAllLibraryCard(){
        for (LibraryCard libraryCard : libraryCards) {
            System.out.println(libraryCard);
        }
    }

    public void displayNeedReturnList(){
        Date now = new Date();
        int thisMonth = now.getMonth();
        for (LibraryCard libraryCard : libraryCards) {
            //System.out.println(libraryCard);
            String[] arr = libraryCard.getReturnDate().split("/");
            if (thisMonth + 1 == Integer.valueOf(arr[1]) && (Integer.valueOf(arr[0]) >= 20) ) {
                System.out.println("Sinh vien " + libraryCard.getName() + " can tra quyen " + libraryCard.getBookCode());
            }
        }
    }
}
