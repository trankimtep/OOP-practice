package timoday.bai7.entity;

public class Person {
    public String name;
    public String dateOfBirth;
    public String homeTown;

    public Person() {}

    public Person(String name, String dateOfBirth, String homeTown) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
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

    public String getYearOfBirth() {
        String [] arr = getDateOfBirth().split("/");
        return arr[2];
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }
}
