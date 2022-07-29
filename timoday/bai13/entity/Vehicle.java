package timoday.bai13.entity;


public class Vehicle {
    protected  String brand;
    protected int publishYear;
    protected int cost;
    protected String color;

    public Vehicle() {}

    public Vehicle(String brand, int publishYear, int cost, String color) {
        this.brand = brand;
        this.publishYear = publishYear;
        this.cost = cost;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // @Override
    // public String toString() {
    //     return  "Hang san xuat: " + brand + "\n" +
    //             "Nam san xuat: " + publishYear + "\n" +
    //             "Gia ban: " + cost + "\n" +
    //             "Mau: " + color + "\n" +
    //             "-----------------------\n";
    // }

    // public void display(){
    //     System.out.println(toString());
    // }
}
