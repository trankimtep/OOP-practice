package timoday.bai4;

import java.util.Scanner;

import timoday.bai4.entity.GroupA;
import timoday.bai4.entity.GroupB;
import timoday.bai4.entity.GroupC;
import timoday.bai4.service.Admissions;

public class Application {
    public static void main(String[] args) {
        Admissions admissions = new Admissions();

        while(true){
            System.out.println("Menu:");
            System.out.println("    1.Nhap thong tin thi sinh");
            System.out.println("    2.Tim kiem theo so bao danh");
            System.out.println("    3.Thoat chuong trinh");
            System.out.print("Lua chon cua ban la: ");

            Scanner scanner  = new Scanner(System.in);
            int option = Integer.valueOf(scanner.nextLine());

            switch(option){
                case 1:
                    System.out.print("So bao danh: ");
                    String identificationNumber = scanner.nextLine();

                    System.out.print("Ho va ten: ");
                    String name = scanner.nextLine();

                    System.out.print("Dia chi: ");
                    String address = scanner.nextLine();

                    System.out.print("Dien uu tien: ");
                    String priorityArea = scanner.nextLine();                

                    System.out.print("Chon khoi thi (A/B/C): ");
                    String group = scanner.nextLine().trim();
                    switch(group){
                        case "A":
                            System.out.print("Diem Toan: ");
                            float mathA = Float.valueOf(scanner.nextLine());

                            System.out.print("Diem Ly: ");
                            float physicA = Float.valueOf(scanner.nextLine());

                            System.out.print("Diem Hoa: ");
                            float chemistryA = Float.valueOf(scanner.nextLine());

                            admissions.addCandidate(new GroupA(identificationNumber, name, address, priorityArea, mathA, physicA, chemistryA));
                            break;
                            
                        case "B":
                            System.out.print("Diem Toan: ");
                            float mathB = Float.valueOf(scanner.nextLine());

                            System.out.print("Diem Hoa: ");
                            float chemistryB = Float.valueOf(scanner.nextLine());

                            System.out.print("Diem Sinh: ");
                            float biology = Float.valueOf(scanner.nextLine());

                            admissions.addCandidate(new GroupB(identificationNumber, name, address, priorityArea, mathB, chemistryB, biology));
                            break;

                        case "C":
                            System.out.print("Diem Van: ");
                            float literature = Float.valueOf(scanner.nextLine());

                            System.out.print("Diem Su: ");
                            float history = Float.valueOf(scanner.nextLine());

                            System.out.print("Diem Dia: ");
                            float geography = Float.valueOf(scanner.nextLine());

                            admissions.addCandidate(new GroupC(identificationNumber, name, address, priorityArea, literature, history, geography));
                            break;
                    }
                    break;

                case 2:
                    System.out.println(admissions.candidates);
                    System.out.print("Nhap so bao danh: ");
                    String id = scanner.nextLine();
                    System.out.println(id);
                    admissions.findByidentificationNumber(id);             
                    break;

                case 3:
                    return;
            }
        }
    }
}
