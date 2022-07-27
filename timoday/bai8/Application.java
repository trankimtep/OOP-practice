package timoday.bai8;

import java.util.Scanner;

import timoday.bai8.management.TeacherManagement;

public class Application {
    public static void main(String[] args) {
        TeacherManagement teacherManagement = new TeacherManagement();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Menu:");
            System.out.println("    1.Nhap giao vien moi");
            System.out.println("    2.Hien thi tat ca giao vien");
            System.out.println("    3.In ra cac giao vien co luong lon hon 8 trieu");
            System.out.println("    4.Dung chuong trinh");
            System.out.print("Lua chon cua ban la: ");

            int option = Integer.valueOf(scanner.nextLine());

            switch (option) {
                case 1: 
                    System.out.println("So giao vien can nhap");
                    int numberTeacher = Integer.valueOf(scanner.nextLine());
                    for (int i = 0; i < numberTeacher; i++){
                        teacherManagement.addTeacher(scanner);
                    }
                    break;

                case 2:
                    teacherManagement.displayAllTeacher();
                    break;

                case 3:
                    teacherManagement.netOver8Milions();
                    break;
                
                case 4:
                    return;
            }
        }
    }
}
