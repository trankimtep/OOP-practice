package timoday.bai3.entity;

public class Magazine extends Document{
    private String releaseCode;
    private String releaseMonth;

    public Magazine() {}

    public Magazine(String documentCode, String publisher, String releaseNumber, String releaseCode, String releaseMonth) {
        super(documentCode, publisher, releaseNumber);
        this.releaseCode = releaseCode;
        this.releaseMonth = releaseMonth;
    }

    public String getReleaseCode() {
        return releaseCode;
    }

    public void setReleaseCode(String releaseCode) {
        this.releaseCode = releaseCode;
    }

    public String getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(String releaseMonth) {
        this.releaseMonth = releaseMonth;
    }


    @Override
    public String toString(){
        return ("Document Code = " + documentCode + "\n"+
                "Publisher = " + publisher + "\n" +
                "Release Number = " + releaseNumber + "\n" +
                "Release Month = " + releaseMonth + "\n" +
                "Release Code = " + releaseCode + "\n" +
                "--------------------------\n");
    }


}
