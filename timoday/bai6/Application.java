package timoday.bai6;

import java.text.ParseException;
import java.util.Scanner;

import timoday.bai6.entity.Customer;
import timoday.bai6.service.HotelManagement;

public class Application {
    public static void main(String[] args) throws ParseException {
        
        HotelManagement hotelManagement = new HotelManagement();
        Scanner scanner = new Scanner(System.in);  

        while (true) {
            System.out.println("Menu:");
            System.out.println("    1.Nhap khach tro");
            System.out.println("    2.Hien khach tro");
            System.out.println("    3.Tinh tien phong");
            System.out.println("    4.Thoat chuong trinh");
            System.out.print("Lua chon cua ban la: ");

            int option = Integer.valueOf(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.print("So khach can nhap: ");
                    int numberCustomer = Integer.valueOf(scanner.nextLine());
    
                    for (int i = 0; i < numberCustomer; i++) {
                        System.out.print("Ten: ");
                        String name = scanner.nextLine();
    
                        System.out.print("Ngay sinh: ");
                        String dateOfBirth = scanner.nextLine();
    
                        System.out.print("So CMND: ");
                        String citizenID = scanner.nextLine();
    
                        System.out.print("Loai phong: ");
                        String kindOfRoom = scanner.nextLine();
    
                        System.out.print("Gia phong: ");
                        int costOfRoom = Integer.valueOf(scanner.nextLine());
    
                        System.out.print("So ngay tro: ");
                        int stayDay = Integer.valueOf(scanner.nextLine());
    
                        hotelManagement.addCustomer(new Customer(name, dateOfBirth, citizenID, kindOfRoom, costOfRoom, stayDay));
                        System.out.println("Customer added!!");
                        
                    }
                    break;
    
                case 2:
                    hotelManagement.displayCustomer();
                    break;
    
                case 3:
                    System.out.print("Nhap so CMND cua khach hang: ");
                    String citizenId = scanner.nextLine();
                    hotelManagement.calculateMoney(citizenId);
                    break;
    
                case 4:
                    scanner.close();
                    return;
            }
        }
    }
}
