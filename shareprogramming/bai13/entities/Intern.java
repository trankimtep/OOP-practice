package bai13.entities;

public class Intern extends Employee{

    private String semester;
    private String majors;
    private String universityName;

    public Intern() {}

    public Intern(long ID, String fullName, String birthDay, String phone, String email,
            String semester, String majors, String universityName) {
        super(ID, fullName, birthDay, phone, email);
        this.semester = semester;
        this.majors = majors;    
        this.universityName = universityName;
        this.employeeType = "Intern";
    }

    public String getGraduationDate() {
        return semester;
    }

    public void setGraduationDate(String semester) {
        this.semester = semester;
    }

    public String getGraduationRank() {
        return majors;
    }

    public void setGraduationRank(String majors) {
        this.majors = majors;
    }

    public String getEducation() {
        return universityName;
    }

    public void setEducation(String universityName) {
        this.universityName = universityName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return  "ID: " + ID + "\n" +
                "Full name: " + fullName + "\n" +
                "Birth day: " + birthDay + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email + "\n" +
                "Employee type: " + employeeType + "\n" +
                "Semester: " + semester + "\n" +
                "Graduation Rank: " + majors + "\n" +
                "University name: " + universityName + "\n" +
                "---------------------------\n";

    }

    @Override
    public void showInfor() {
        System.out.println(this);        
    }    
}
