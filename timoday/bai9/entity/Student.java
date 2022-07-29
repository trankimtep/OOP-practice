package timoday.bai9.entity;

public class Student {
    public String name;
    public String code;
    public String dateOfBirth;
    public String classs;

    public Student(String name, String code, String dateOfBirth, String classs) {
        this.name = name;
        this.code = code;
        this.dateOfBirth = dateOfBirth;
        this.classs = classs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }
}
