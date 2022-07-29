package timoday.bai13.entity;

public class Motobike extends Vehicle{
    private float wattage;

    public Motobike () {}

    public Motobike (String brand, int publishYear, int cost, String color, float wattage) {
        super(brand, publishYear, cost, color);
        this.wattage = wattage;
    }

    public float getWattage() {
        return wattage;
    }

    public void setWattage(float wattage) {
        this.wattage = wattage;
    }

    @Override
    public String toString(){
        return  "Hang san xuat: " + brand + "\n" +
                "Nam san xuat: " + publishYear + "\n" +
                "Gia ban: " + cost + "\n" +
                "Mau: " + color + "\n" +
                "Cong suat: " + wattage + "\n" +
                "-----------------------\n";
    }
}
