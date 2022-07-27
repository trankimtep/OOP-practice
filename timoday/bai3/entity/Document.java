package timoday.bai3.entity;


public class Document {
    public String documentCode;
    public String publisher;
    public String releaseNumber;

    public Document() {}

    public Document(String documentCode, String publisher, String releaseNumber) {
        this.documentCode = documentCode;
        this.publisher = publisher;
        this.releaseNumber = releaseNumber;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(String releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    @Override
    public String toString(){
        return ("Document Code = " + documentCode + "\n"+
                "Publisher = " + publisher + "\n" +
                "Release Number = " + releaseNumber + "\n" +
                "--------------------------\n");
    }


}
