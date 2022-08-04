package bai13.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bai13.entities.Employee;
import bai13.entities.Experience;
import bai13.entities.Fresher;
import bai13.entities.Intern;

public class EmployeeManagement {
    public static ArrayList<Employee> employees = new ArrayList<Employee>();

    static{
        employees.add(new Experience(1, "Nguyen Van A", "01/01/2001", "0123456789", "Anv@gmail.com", 10, "chicken blood cutting"));
        employees.add(new Experience(2, "Nguyen Van B", "01/01/2001", "0123456789", "Bnv@gmail.com", 10, "duck blood cutting"));
        employees.add(new Fresher(3, "Tran Van C", "01/01/2001", "0789654113", "Ctv@gmail.com", "02/01/2001", "Good", "PTIT"));
        employees.add(new Fresher(4, "Tran Van D", "01/01/2001", "0789654113", "Dtv@gmail.com", "02/01/2001", "Good", "PTIT"));
        employees.add(new Intern(5, "Pham Van E", "01/01/2001", "0789654113", "Epv@gmail.com", "7", "infosec", "PTIT"));
        employees.add(new Intern(6, "Pham Van F", "01/01/2001", "0789654113", "Fpv@gmail.com", "7", "infosec", "PTIT"));
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.increaseEmployeeCount();
    }

    public Employee findById(long ID) {
        return employees.stream().filter(employee -> employee.getID() == ID).findFirst().orElse(null);
    }

    public List<Employee> findByType(int type) {
        return employees.stream().filter(employee -> {
                if (type == 1) {
                    return employee instanceof Experience;
                } else if (type == 2) {
                    return employee instanceof Fresher;
                } else {
                    return employee instanceof Intern;
                }
            }).collect(Collectors.toList());        
    }

    public void edit (long ID, Employee employee) {
        deleteEmployee(ID);
        addEmployee(employee);
    }

    public void deleteEmployee(long ID) {
        Employee needToDelete = employees.stream().filter(employee -> employee.getID() == ID).findFirst().orElse(null);
        employees.remove(needToDelete);
    }
}
