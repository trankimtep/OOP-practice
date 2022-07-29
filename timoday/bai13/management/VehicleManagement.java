package timoday.bai13.management;

import java.util.ArrayList;
import java.util.Scanner;

import timoday.bai13.entity.Car;
import timoday.bai13.entity.Motobike;
import timoday.bai13.entity.Truck;
import timoday.bai13.entity.Vehicle;

public class VehicleManagement {
    public static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public void registVehicle (Scanner scanner) {
        System.out.print("Nhap loai xe can dang ky: (1:oto/ 2:xe may/ 3:xe tai)");
        int option = Integer.valueOf(scanner.nextLine());

        System.out.print("Hang san xuat: ");
        String brand = scanner.nextLine();

        System.out.print("Nam san xuat: ");
        int publishYear = Integer.valueOf(scanner.nextLine());

        System.out.print("Gia ban: ");
        int cost = Integer.valueOf(scanner.nextLine());

        System.out.print("Mau sac: ");
        String color = scanner.nextLine();

        switch (option) {
            case 1: 
                System.out.print("So cho ngoi: ");
                int seatNumber = Integer.valueOf(scanner.nextLine());

                System.out.print("Loai dong co: ");
                String engineType = scanner.nextLine();

                vehicles.add(new Car(brand, publishYear, cost, color, seatNumber, engineType));

                break;

            case 2:
                System.out.print("Cong suat: ");
                float wattage = Float.valueOf(scanner.nextLine());
                
                vehicles.add(new Motobike(brand, publishYear, cost, color, wattage));

                break;

            case 3:
                System.out.print("Trong tai: ");
                float tonnage = Float.valueOf(scanner.nextLine());

                vehicles.add(new Truck(brand, publishYear, cost, color, tonnage));

                break;
        }
    }

    public void findByColor (String color) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getColor().equals(color)) {
                System.out.println(vehicles.get(i));
            }
        }
    }

    public void findByPublishYear (int publishYear) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getPublishYear() == publishYear) {
                System.out.println(vehicles.get(i));
            }
        }
    }
}
