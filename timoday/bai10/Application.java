package timoday.bai10;

import java.util.Scanner;

import timoday.bai10.management.BillManagement;

public class Application {
    public static void main(String[] args) {
        BillManagement billManagement = new BillManagement();
        Scanner scanner = new Scanner(System.in);

        while(true) {

            System.out.println("Menu:");
            System.out.println("    1.Nhap thong tin ho su dung dien:");
            System.out.println("    2.Nhap thong tin bien lai");
            System.out.println("    3.In ra cac bien lai da nhap");
            System.out.println("    4.Dung chuong trinh");
            System.out.print("Lua chon cua ban la: ");

            int option = Integer.valueOf(scanner.nextLine());

            switch (option) {
                case 1:
                    System.out.print("So ho can nhap: ");
                    int numberHousehold = Integer.valueOf(scanner.nextLine());

                    for (int i = 0; i < numberHousehold; i++) {
                        billManagement.addHousehold(scanner);
                    }

                    System.out.println("Added a new household !!!");
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Nhap ma cong to: ");
                    String meterID = scanner.nextLine();

                    System.out.print("Nhap chi so cu: ");
                    long oldIndex = Long.valueOf(scanner.nextLine());

                    System.out.print("Nhap chi so moi: ");
                    long newIndex = Long.valueOf(scanner.nextLine());

                    billManagement.enterIndex(meterID, oldIndex, newIndex);

                    System.out.println("Added a new bill !!!");
                    break;

                case 3:
                    billManagement.displayBills();                    
                    break;

                case 4:
                    return;
            }
        }
    }
}
