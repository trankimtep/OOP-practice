package timoday.bai13.entity;

public class Truck extends Vehicle{
    private float tonnage;
    public Truck () {}

    public Truck (String brand, int publishYear, int cost, String color, float tonnage) {
        super(brand, publishYear, cost, color);
        this.tonnage = tonnage;
    }

    public float getTonnage() {
        return tonnage;
    }

    public void setTonnage(float tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString(){
        return  "Hang san xuat: " + brand + "\n" +
                "Nam san xuat: " + publishYear + "\n" +
                "Gia ban: " + cost + "\n" +
                "Mau: " + color + "\n" +
                "Trong tai: " + tonnage + "\n" +
                "-----------------------\n";
    }

    
}

