package timoday.bai6.service;

import java.util.ArrayList;

import timoday.bai6.entity.Customer;

public class HotelManagement {

    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    public void addCustomer (Customer customer) {
        customers.add(customer);
    }

    public void deleteCustomer (Customer customer) {
        customers.remove(customer);
    }

    public void displayCustomer () {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void calculateMoney (String citizenId) {
        for (Customer customer : customers) {
            if (customer.getCitizenID().equals(citizenId)) {
                System.out.println("So tien khach phai tra la: "+customer.getStayDay() * customer.getCostOfRoom());
            }
        }
    }
}
