package timoday.bai3.entity;

public class Book extends Document{
    private String writer;
    private int numberPages;
    
    public Book() {}
    
    public Book(String documentCode, String publisher, String releaseNumber, String writer, int numberPages) {
        super(documentCode, publisher, releaseNumber);
        this.writer = writer;
        this.numberPages = numberPages;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    @Override
    public String toString(){
        return ("Document Code = " + documentCode + "\n"+
                "Publisher = " + publisher + "\n" +
                "Release Number = " + releaseNumber + "\n" +
                "Writer = " + writer + "\n" +
                "Number Pages = " + numberPages + "\n" +
                "--------------------------\n");
    }

    


}
