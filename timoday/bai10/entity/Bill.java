package timoday.bai10.entity;

public class Bill extends Household{
    private long oldIndex;
    private long newIndex;
    //private long totalBill;

    public Bill(String ownerName, String homeNumber, String meterID) {
        this.ownerName = ownerName;
        this.homeNumber = homeNumber;
        this.meterID = meterID;
    }
        

    public Bill(String ownerName, String homeNumber, String meterID, long oldIndex, long newIndex) {
        super(ownerName, homeNumber, meterID);
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
    }

    public long getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(long oldIndex) {
        this.oldIndex = oldIndex;
    }

    public long getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(long newIndex) {
        this.newIndex = newIndex;
    }

    public long getTotalBill() {
        return (newIndex - oldIndex) * 750;
    }

    // public void setTotalBill(long totalBill) {
    //     this.totalBill = totalBill;
    // }

    @Override
    public String toString() {
        return "Ten chu ho: " + ownerName + "\n" +
                "So nha: " + homeNumber + "\n" +
                "Ma cong to: " + meterID + "\n" +
                "Chi so cu: " + oldIndex + "\n" +
                "Chi so moi: " + newIndex + "\n" +
                "Tong tien: " + getTotalBill() + "\n" +
                "----------------\n";
    }
}
