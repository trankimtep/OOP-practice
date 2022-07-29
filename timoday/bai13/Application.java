package timoday.bai13;

import java.util.Scanner;

import timoday.bai13.management.VehicleManagement;

public class Application {
    public static void main(String[] args) {
        VehicleManagement vehicleManagement = new VehicleManagement();
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Menu:");
            System.out.println("    1.Dang ky phuong tien moi:");
            System.out.println("    2.Tim phuong tien theo mau");
            System.out.println("    3.Tim phuong tien theo nam san xuat");
            System.out.println("    4.Dung chuong trinh");
            System.out.print("Lua chon cua ban la: ");

            int option = Integer.valueOf(scanner.nextLine());

            switch (option) {
                case 1:
                    vehicleManagement.registVehicle(scanner);
                    break;

                case 2:
                    System.out.print("Nhap mau can tim: ");
                    String color = scanner.nextLine();

                    vehicleManagement.findByColor(color);
                    break;

                case 3:
                    System.out.print("Nhap nam san xuat can tim: ");
                    int publishYear = Integer.valueOf(scanner.nextLine());

                    vehicleManagement.findByPublishYear(publishYear);
                    break;

                case 4:
                    return;
            }
        }
    }
}
