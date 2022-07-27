package timoday.bai4.entity;

public class GroupB extends Candidate{
    private float math;
    private float chemistry;
    private float biology;

    public GroupB() {}

    public GroupB(String identificationNumber, String name, String address, String priorityArea, float math, float chemistry, float biology) {
        super(identificationNumber, name, address, priorityArea);
        this.math = math;
        this.chemistry = chemistry;
        this.biology = biology;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }

    public float getBiology() {
        return biology;
    }

    public void setBiology(float biology) {
        this.biology = biology;
    }

    @Override
    public String toString() {
        return "GroupB{" +
                "math=" + math +
                ", chemistry=" + chemistry +
                ", biology=" + biology +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea='" + priorityArea + '\'' +
                '}';
    }
}
