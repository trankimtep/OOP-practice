package bai13.entities;

public class Fresher extends Employee{

    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {}

    public Fresher(long ID, String fullName, String birthDay, String phone, String email,
            String graduationDate, String graduationRank, String education) {
        super(ID, fullName, birthDay, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;    
        this.education = education;
        this.employeeType = "Fresher";
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return  "ID: " + ID + "\n" +
                "Full name: " + fullName + "\n" +
                "Birth day: " + birthDay + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email + "\n" +
                "Graduation date: " + graduationDate + "\n" +
                "Graduation Rank: " + graduationRank + "\n" +
                "Education: " + education + "\n" +
                "---------------------------\n";

    }

    @Override
    public void showInfor() {
        System.out.println(this);        
    }    
}
