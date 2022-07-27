package timoday.bai4.entity;

public class GroupA extends Candidate{
    private float math;
    private float physic;
    private float chemistry;

    public GroupA() {}
    public GroupA(String identificationNumber, String name, String address, String priorityArea, float math, float physic, float chemistry) {
        super(identificationNumber, name, address, priorityArea);
        this.math = math;
        this.physic = physic;
        this.chemistry = chemistry;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysic() {
        return physic;
    }

    public void setPhysic(float physic) {
        this.physic = physic;
    }

    public float getChemistry() {
        return chemistry;
    }

    public void setChemistry(float chemistry) {
        this.chemistry = chemistry;
    }
    
    @Override
    public java.lang.String toString() {
        return "GroupA{" +
                "math=" + math +
                ", physic=" + physic +
                ", chemistry=" + chemistry +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea='" + priorityArea + '\'' +
                '}';
    }
}
