package timoday.bai6.entity;

import java.text.ParseException;

public class Customer extends Person{
    private String kindOfRoom;
    private int costOfRoom;
    private int stayDay;

    public Customer() {}

    public Customer(String name, String dateOfBirth, String citizenID, String kindOfRoom, int costOfRoom, int stayDay) throws ParseException {
        super(name, dateOfBirth, citizenID);
        this.kindOfRoom = kindOfRoom;
        this. costOfRoom = costOfRoom;
        this. stayDay = stayDay;
    }

    public String getKindOfRoom() {
        return kindOfRoom;
    }

    public void setKindOfRoom(String kindOfRoom) {
        this.kindOfRoom = kindOfRoom;
    }

    public int getCostOfRoom() {
        return costOfRoom;
    }

    public void setCostOfRoom(int costOfRoom) {
        this.costOfRoom = costOfRoom;
    }

    public int getStayDay() {
        return stayDay;
    }

    public void setStayDay(int stayDay) {
        this.stayDay = stayDay;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", citizenID='" + citizenID + '\'' +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                ", costOfRoom=" + costOfRoom +
                ", stayDay=" + stayDay +                
                '}' + "\n";
    }
}
