package bai13.entities;

public class Certificate {
    private long ID;
    private String name;
    private String rank;
    private String date;

    public Certificate() {}

    public Certificate(long ID, String name, String rank, String date) {
        this.ID = ID;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  "ID: " + ID + "\n" +
                "Name: " + name + "\n" +
                "Rank: " + rank + "\n" +
                "Date: " + date + "\n" +
                "---------------------------\n";
    }
}
