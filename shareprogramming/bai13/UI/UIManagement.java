package bai13.UI;

import java.util.List;
import java.util.Scanner;

import bai13.entities.Employee;
import bai13.entities.Experience;
import bai13.entities.Fresher;
import bai13.entities.Intern;
import bai13.exceptions.BirthdayException;
import bai13.exceptions.EmailException;
import bai13.exceptions.NameException;
import bai13.exceptions.PhoneException;
import bai13.services.DataValidator;
import bai13.services.EmployeeManagement;

public class UIManagement {
    public UIManagement() {}

    public static String inputName (Scanner scanner) {
        String result;
        try {
            System.out.print("Full name: ");
            result = scanner.nextLine();
            DataValidator dataValidator = new DataValidator();
            dataValidator.nameCheck(result);
        } catch (NameException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());;
            return inputName(scanner);
        }
        return result;
    }

    public static String inputBirthday (Scanner scanner) {
        String result;
        try {
            System.out.print("Birthday: ");
            result = scanner.nextLine();
            DataValidator dataValidator = new DataValidator();
            dataValidator.birthdayCheck(result);
        } catch (BirthdayException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());;
            return inputBirthday(scanner);
        }
        return result;
    }

    public static String inputEmail (Scanner scanner) {
        String result;
        try {
            System.out.print("Email: ");
            result = scanner.nextLine();
            DataValidator dataValidator = new DataValidator();
            dataValidator.emailCheck(result);
        } catch (EmailException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());;
            return inputEmail(scanner);
        }
        return result;
    }

    public static String inputPhone (Scanner scanner) {
        String result;
        try {
            System.out.print("Phone Number: ");
            result = scanner.nextLine();
            DataValidator dataValidator = new DataValidator();
            dataValidator.phoneCheck(result);
        } catch (PhoneException e) {
            //TODO: handle exception
            System.out.println(e.getMessage());;
            return inputPhone(scanner);
        }
        return result;
    }

    public void enterNewEmployee(Scanner scanner) {
                    System.out.print("Employee type (1:Experience/ 2:Fresher/ 3:Intern): ");
                    int type = Integer.valueOf(scanner.nextLine());

                    System.err.print("ID:");
                    long ID = Long.valueOf(scanner.nextLine());

                    String fullName = inputName(scanner);

                    String birthDay = inputBirthday(scanner);

                    String phone = inputPhone(scanner);

                    String email = inputEmail(scanner);

                    EmployeeManagement employeeManagement = new EmployeeManagement();
                    switch (type) {
                        case 1:
                            System.out.print("Experience Years: ");
                            int expInYear = Integer.valueOf(scanner.nextLine());
                            System.out.print("Pro Skill: ");
                            String proSkill = scanner.nextLine();

                            employeeManagement.addEmployee(new Experience(ID, fullName, birthDay, phone, email,expInYear, proSkill));

                            break;
                        
                        case 2:
                            System.out.print("Graduation date: ");
                            String graduationDate = scanner.nextLine();

                            System.out.print("Graduation Rank: ");
                            String graduationRank = scanner.nextLine();

                            System.out.print("Education: ");
                            String education = scanner.nextLine();

                            employeeManagement.addEmployee(new Fresher(ID, fullName, birthDay, phone, email, graduationDate, graduationRank, education));
                            break;

                        case 3:
                            System.out.print("Semester: ");
                            String semester = scanner.nextLine();

                            System.out.print("Major: ");
                            String majors = scanner.nextLine();

                            System.out.print("University Name: ");
                            String universityName = scanner.nextLine();

                            employeeManagement.addEmployee(new Intern(ID, fullName, birthDay, phone, email, semester, majors, universityName));

                    }
                    System.out.println("New employee is added successfully");
    }

    public void editEmployee (Scanner scanner) {
        System.out.print("Nhap ID cua nhan vien can sua: ");
        long IDtoEdit = Long.valueOf(scanner.nextLine());

        System.out.println("Nhap thong tin moi: ");

        System.out.print("Employee type (1:Experience/ 2:Fresher/ 3:Intern): ");
        int type = Integer.valueOf(scanner.nextLine());

        String fullName = inputName(scanner);

        String birthDay = inputBirthday(scanner);

        String phone = inputPhone(scanner);

        String email = inputEmail(scanner);
                    
        EmployeeManagement employeeManagement = new EmployeeManagement();

        switch (type) {
            case 1:
                System.out.print("Experience Years: ");
                int expInYear = Integer.valueOf(scanner.nextInt());

                System.out.print("Pro Skill: ");
                String proSkill = scanner.nextLine();

                employeeManagement.edit(IDtoEdit, new Experience(IDtoEdit, fullName, birthDay, phone, email, expInYear, proSkill));
                break;
                        
            case 2:
                System.out.print("Graduation date: ");
                String graduationDate = scanner.nextLine();

                System.out.print("Graduation Rank: ");
                String graduationRank = scanner.nextLine();

                System.out.print("Education: ");
                String education = scanner.nextLine();

                employeeManagement.edit(IDtoEdit, new Fresher(IDtoEdit, fullName, birthDay, phone, email, graduationDate, graduationRank, education));
                break;

            case 3:
                System.out.print("Semester: ");
                String semester = scanner.nextLine();

                System.out.print("Major: ");
                String majors = scanner.nextLine();

                System.out.print("University Name: ");
                String universityName = scanner.nextLine();

                employeeManagement.edit(IDtoEdit, new Intern(IDtoEdit, fullName, birthDay, phone, email, semester, majors, universityName));
        }
        System.out.println("Employee info is edited successfully !!");
    }

    public void findEmployeeByID(Scanner scanner) {
        System.out.print("Nhap ID can tim: ");
        long IDToFind = Long.valueOf(scanner.nextLine());
        EmployeeManagement employeeManagement = new EmployeeManagement();
        System.out.println(employeeManagement.findById(IDToFind));
    }

    public void findEmployeeByType(Scanner scanner) {
        System.out.print("Nhap loai can tim: ");
        int typeToFind = Integer.valueOf(scanner.nextLine());
        if (typeToFind == 1) {
            System.out.println("\n List of Experience employee: ");
        } else if (typeToFind == 2) {
            System.out.println("\n List of Fresher employee: ");
        } else {
            System.out.println("\n List of Inter employee: ");
        }
        EmployeeManagement employeeManagement = new EmployeeManagement();
        List<Employee> newList = employeeManagement.findByType(typeToFind);
                    
        System.out.println("\n" + newList);
    }

    public void deleteEmployee(Scanner scanner){
        System.out.print("Nhap ID can xoa: ");
        long IDtoDelete = Long.valueOf(scanner.nextLine());
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.deleteEmployee(IDtoDelete);
        System.out.println("Employee is deleted successfully !!");
    }
}
