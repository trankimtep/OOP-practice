package timoday.bai8.entity;

public class Teacher extends Person{
    private float gross;
    private float bonus;
    private float mulct;

    public Teacher() {}

    public Teacher(String name, String dateOfBirth, String homeTown, float gross, float bonus, float mulct) {
        super(name, dateOfBirth, homeTown);
        this.gross = gross;
        this.bonus = bonus;
        this.mulct = mulct;
    }

    public float getGross() {
        return gross;
    }

    public void setGross(float gross) {
        this.gross = gross;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getMulct() {
        return mulct;
    }

    public void setMulct(float mulct) {
        this.mulct = mulct;
    }

    public float getNet (){
        return (gross + bonus - mulct);
    }

    @Override
    public String toString() {
        return ("Ten: " + name + "\n" +
                "Ngay sinh: " + dateOfBirth + "\n" +
                "Que quan: " + homeTown + "\n" +
                "Luong cung: " + gross + "\n" + 
                "Thuong: " + bonus + "\n" +
                "Phat: " + mulct + "\n" + 
                "Thuc linh: " + getNet() + "\n" +
                "---------------------\n");
    }
}
