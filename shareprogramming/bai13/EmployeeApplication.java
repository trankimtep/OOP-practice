package bai13;

import java.util.Scanner;
import bai13.UI.UIManagement;

public class EmployeeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UIManagement uiManagement = new UIManagement();

        while (true) {
            System.out.println("\n \n Menu: ");
            System.out.println("    1.Nhap nhan vien moi");
            System.out.println("    2.Tim nhan vien theo ID");
            System.out.println("    3.Tim nhan vien theo loai");
            System.out.println("    4.Sua thong tin nhan vien");
            System.out.println("    5.Xoa nhan vien");
            System.out.println("    6.Dung chuong trinh");
            System.out.print("Lua chon cua ban la: ");

            int option = Integer.valueOf(scanner.nextLine());

            switch (option) {
                case 1:
                    uiManagement.enterNewEmployee(scanner);
                    break;

                case 2:
                    break;

                case 3:
                    uiManagement.findEmployeeByType(scanner);
                    break;

                case 4:
                    uiManagement.editEmployee(scanner);
                    break;
                
                case 5:
                    uiManagement.deleteEmployee(scanner);
                    break;
                case 6:
                    return;    
            }
        }

    }
}
