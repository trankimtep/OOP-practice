package timoday.bai13.entity;

public class Car extends Vehicle{
    private String engineType;
    private int seatNummber;    

    public Car(int seatNummber, String engineType) {
        this.seatNummber = seatNummber;
        this.engineType = engineType;
    }

    public Car(String brand, int publishYear, int cost, String color, int seatNummber, String engineType) {
        super(brand, publishYear, cost, color);
        this.seatNummber = seatNummber;
        this.engineType = engineType;
    }

    public int getSeatNummber() {
        return seatNummber;
    }

    public void setSeatNummber(int seatNummber) {
        this.seatNummber = seatNummber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return  "Hang san xuat: " + brand + "\n" +
                "Nam san xuat: " + publishYear + "\n" +
                "Gia ban: " + cost + "\n" +
                "Mau: " + color + "\n" +
                "So cho ngoi: " + seatNummber + "\n" +
                "Kieu dong co: " + engineType + "\n" +
                "-----------------------\n";
    }
}
