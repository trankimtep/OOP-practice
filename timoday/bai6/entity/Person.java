package timoday.bai6.entity;


public class Person {
    public String name;
    public String dateOfBirth;
    public String citizenID;

    public Person() {}

    public Person(String name, String dateOfBirth, String citizenID) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.citizenID = citizenID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", citizenID='" + citizenID + '\'' +
                '}';
    }
}
