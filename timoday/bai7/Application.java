package timoday.bai7;

import java.util.Scanner;


import timoday.bai7.management.StudentBrief;

public class Application {
    public static void main(String[] args) {
        StudentBrief studentBrief = new StudentBrief();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Menu:");
            System.out.println("    1.Nhap danh sach hoc sinh");
            System.out.println("    2.Hien thi hoc sinh sinh nam 1985 que Thai Nguyen");
            System.out.println("    3.Hien thi cac hoc sinh lop 10A1");
            System.out.println("    4.Ket thuc chuong trinh");
            System.out.println("Lua chon cua ban la:");

            int option = Integer.valueOf(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.print("So hoc sinh can nhap la: ");
                    int numberStudents = Integer.valueOf(scanner.nextLine());
                    for (int i = 1; i <= numberStudents; i++) {
                        studentBrief.addStudent(scanner);
                    }
                    System.out.println(studentBrief.students);
                    break;

                case 2:
                    studentBrief.thaiNguyen1985();
                    break;

                case 3:
                    studentBrief.lop10A1();
                    break;

                case 4:
                    return;
            }
        }

    }
}
