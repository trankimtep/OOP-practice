package timoday.bai10.management;

import java.util.ArrayList;
import java.util.Scanner;

import timoday.bai10.entity.Bill;
import timoday.bai10.entity.Household;

public class BillManagement {
    public static ArrayList<Household> households = new ArrayList<Household>();
    public static ArrayList<Bill> bills = new ArrayList<Bill>();

    public void addHousehold (Scanner scanner) {
        System.out.print("Ten chu ho: ");
        String ownerName = scanner.nextLine();

        System.out.print("So nha: ");
        String homeNumber = scanner.nextLine();

        System.out.println("Ma cong to: ");
        String meterID = scanner.nextLine();

        households.add(new Household(ownerName, homeNumber, meterID));
    }

    public void addBill (Household household, long oldIndex, long newIndex) {
        bills.add(new Bill(household.getOwnerName(), household.getHomeNumber(), household.getMeterID(), oldIndex, newIndex));
    }

    public void enterIndex (String meterID, long oldIndex, long newIndex) {
        for (Household household : households) {
            if (household.getMeterID().equals(meterID)) {
                addBill(household, oldIndex, newIndex);
            }
        }
    }

    public void displayBills() {
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }
}
