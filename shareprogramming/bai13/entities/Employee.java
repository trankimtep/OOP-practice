package bai13.entities;


import java.util.List;


public abstract class Employee {
    protected long ID;
    protected String fullName;
    protected String birthDay;
    protected String phone;
    protected String email;
    protected String employeeType;
    protected static int employeeCount = 0;

    protected List<Certificate> certificates ;

    public Employee() {}

    public Employee(long ID, String fullName, String birthDay, String phone, String email) {
        this.ID = ID;
        this.fullName = fullName;
        this.birthDay = birthDay;
        this.phone = phone;
        this.email = email;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void increaseEmployeeCount() {
        employeeCount ++;
    }

    public List<Certificate> getArrayList() {
        return certificates;
    }

    // public void enterCertificate(Scanner scanner) {
    //     System.out.print("ID: ");
    //     long ID = Long.valueOf(scanner.nextLine());

    //     System.out.print("Name: ");
    //     String name = scanner.nextLine();

    //     System.out.print("Rank: ");
    //     String rank = scanner.nextLine();

    //     System.out.print("Date: ");
    //     String date = scanner.nextLine();

    //     certificates.add(new Certificate(ID, name, rank, date));
    // }

    public void setCertificate(List<Certificate> certificates) {
        this.certificates = certificates;
    }

    public abstract void showInfor ();
}
