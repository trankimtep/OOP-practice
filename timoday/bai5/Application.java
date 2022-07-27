package timoday.bai5;

import java.util.Scanner;

import timoday.bai5.entity.Household;
import timoday.bai5.entity.People;
import timoday.bai5.service.Residential;

public class Application {
    public static void main(String[] args) {
        Residential residential = new Residential();

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("So ho dan can nhap: ");
        int numberHousehold = Integer.valueOf(scanner.nextLine());

        while (numberHousehold > 0){

            System.out.print("So nha: ");
            String homeNumber = scanner.nextLine();

            Household household = new Household(homeNumber);

            System.out.println("So nguoi trong ho: ");
            int numberPeople = Integer.valueOf(scanner.nextLine());
            household.setNumberPeople(numberPeople);

            for (int i = 1; i <= numberPeople; i++){
                System.out.println("Thanh vien " + i);
                System.out.print("Ten: ");
                String name = scanner.nextLine();

                System.out.print("Ngay sinh: ");
                String dateOfBirth = scanner.nextLine();

                System.out.print("Nghe nghiep: ");
                String job = scanner.nextLine();
                System.out.println("");
                
                People newPerson = new People(name, dateOfBirth, job);
                household.addmember(newPerson);
            }
            household.displayMembers();
            residential.addHousehold(household);
            numberHousehold --;
        }
        
        residential.anCo();

    }
}
