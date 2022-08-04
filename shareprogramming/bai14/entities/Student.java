package bai14.entities;

import java.util.Comparator;

public abstract class Student implements Comparable<Student>{
    protected String fullName;
    protected String doB;
    protected String sex;
    protected String phoneNumber;
    protected String universityName;
    protected String gradeLevel;

    public Student () {}

    public Student (String fullName, String boD, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public abstract void showMyInfo();

    @Override
    public int compareTo(Student o){
        if (fullName.equals(o.fullName)) {
            return (int)(phoneNumber.compareTo(o.phoneNumber));
        }
        return (fullName.compareTo(fullName));
    }
}
