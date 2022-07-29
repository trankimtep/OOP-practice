package timoday.bai10.entity;

public class Household {
    public String ownerName;
    public String homeNumber;
    public String meterID;

    public Household () {}

    public Household(String ownerName, String homeNumber, String meterID) {
        this.ownerName = ownerName;
        this.homeNumber = homeNumber;
        this.meterID = meterID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public String getMeterID() {
        return meterID;
    }

    public void setMeterID(String meterID) {
        this.meterID = meterID;
    }
}
