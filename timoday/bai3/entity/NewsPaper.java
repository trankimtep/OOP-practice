package timoday.bai3.entity;

public class NewsPaper extends Document{
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    private String releaseDate;

    public NewsPaper() {}

    public NewsPaper(String documentCode, String publisher, String releaseNumber, String releaseDate){
        super(documentCode, publisher, releaseNumber);
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString(){
        return ("Document Code = " + documentCode + "\n"+
                "Publisher = " + publisher + "\n" +
                "Release Number = " + releaseNumber + "\n" +
                "Release Date = " + releaseDate + "\n" +
                "--------------------------\n");
    }

    
}
