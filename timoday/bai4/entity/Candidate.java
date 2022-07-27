package timoday.bai4.entity;

public class  Candidate {
    public String identificationNumber;
    public String name;
    public String address;
    public String priorityArea;

    public Candidate() {}

    public Candidate(String identificationNumber, String name, String address, String priorityArea) {
        this.identificationNumber = identificationNumber;
        this.name = name;
        this.address = address;
        this.priorityArea = priorityArea;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriorityArea() {
        return priorityArea;
    }

    public void setPriorityArea(String priorityArea) {
        this.priorityArea = priorityArea;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "identificationNumber='" + identificationNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea='" + priorityArea + '\'' +
                '}';
    }
}
