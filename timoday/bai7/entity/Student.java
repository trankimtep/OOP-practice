package timoday.bai7.entity;

public class Student extends Person{
    private String inClass;
    private String course;
    private String term;

    public Student() {}

    public Student(String name, String dateOfBirth, String homeTown, String inClass, String course, String term){
        super(name, dateOfBirth, homeTown);
        this.inClass = inClass;
        this.course = course;
        this.term = term;
    }

    public String getInClass() {
        return inClass;
    }

    public void setInClass(String inClass) {
        this.inClass = inClass;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return ("Ten: " + name + "\n" + 
                "Ngay sinh: " + dateOfBirth + "\n" +
                "Que quan: " + homeTown + "\n" +
                "Lop: " + inClass + "\n" +
                "Khoa hoc: " + course + "\n" +
                "Ki hoc: " + term + "\n" + 
                "--------------------\n");
    }
}
