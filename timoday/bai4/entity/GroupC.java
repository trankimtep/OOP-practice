package timoday.bai4.entity;

public class GroupC extends Candidate{
    private float literature;
    private float history;
    private float geography;

    public GroupC() {}

    public GroupC(String identificationNumber, String name, String address, String priorityArea, float literature, float history, float geography) {
        super(identificationNumber, name, address, priorityArea);
        this.literature = literature;
        this.history = history;
        this.geography = geography;
    }

    public float getLiterature() {
        return literature;
    }

    public void setLiterature(float literature) {
        this.literature = literature;
    }

    public float getHistory() {
        return history;
    }

    public void setHistory(float history) {
        this.history = history;
    }

    public float getGeography() {
        return geography;
    }

    public void setGeography(float geography) {
        this.geography = geography;
    }

    @Override
    public String toString() {
        return "GroupC{" +
                "literature=" + literature +
                ", history=" + history +
                ", geography=" + geography +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", priorityArea='" + priorityArea + '\'' +
                '}';
    }
}
