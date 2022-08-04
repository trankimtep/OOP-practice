package bai13.entities;

public class Experience extends Employee{

    private int expInYear;
    private String proSkill;

    public Experience() {}

    public Experience(long ID, String fullName, String birthDay, String phone, String email,
            int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email);
        this.expInYear = expInYear;
        this.proSkill = proSkill;    
        this.employeeType = "Experience";
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return  "ID: " + ID + "\n" +
                "Full name: " + fullName + "\n" +
                "Birth day: " + birthDay + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email + "\n" +
                "Experience years: " + expInYear + "\n" +
                "Pro skill: " + proSkill + "\n" +
                "---------------------------\n";

    }

    @Override
    public void showInfor() {
        System.out.println(this);        
    }    
}
