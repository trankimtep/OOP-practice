package timoday.bai5.entity;

import java.util.ArrayList;

public class Household {

    private int numberPeople;
    private String homeNumber;
    public  static ArrayList<People> members = new ArrayList<People>();

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getHomeNumber() {
        return homeNumber;
    }

    public void setHomeNumber(String homeNumber) {
        this.homeNumber = homeNumber;
    }

    public ArrayList<People> getmemberss() {
        return members;
    }

    public void setmemberss(ArrayList<People> members) {
        this.members = members;
    }

    public Household(String homeNumber) {
        this.homeNumber = homeNumber;
    }
    
    public Household(int numberPeople, String homeNumber, ArrayList<People> members) {
        this.numberPeople = numberPeople;
        this.homeNumber = homeNumber;
        this.members = members;
    }

    public void addmember(People person){
        members.add(person);
    }

    public void displayMembers(){
        System.out.println("--------------");
        System.out.println("Ho dan o nha so: " + homeNumber);
        System.out.println("Co " + numberPeople + " thanh vien:");
        System.out.println("----");
        for (People person : members){
            System.out.println(person);
        }
        System.out.println("--------------");
    }    
}
