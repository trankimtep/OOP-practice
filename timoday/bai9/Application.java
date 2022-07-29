package timoday.bai9;

import java.util.Scanner;

import timoday.bai9.management.LibraryManagement;

public class Application {
    public static void main(String[] args) {
        LibraryManagement libraryManagement = new LibraryManagement();
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Menu:");
            System.out.println("    1.Nhap sinh vien moi");
            System.out.println("    2.Hien thi tat ca sinh vien");
            System.out.println("    3.In ra cac sinh vien can tra sach");
            System.out.println("    4.Dung chuong trinh");
            System.out.print("Lua chon cua ban la: ");

            int option = Integer.valueOf(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.print("So sinh vien can nhap: ");
                    int numberStudents = Integer.valueOf(scanner.nextLine());

                    for (int i = 0; i < numberStudents; i++) {
                        libraryManagement.addLibraryCard(scanner);
                        System.out.println("Added new Student !!!!");
                    }
                    break;

                case 2:
                    libraryManagement.displayAllLibraryCard();
                    break;

                case 3:
                    libraryManagement.displayNeedReturnList();
                    break;

                case 4:
                    return;
            }
        }
    }
}
