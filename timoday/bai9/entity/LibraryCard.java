package timoday.bai9.entity;

public class LibraryCard extends Student{
    private String borrowCode;
    private String borrowDate;
    private String returnDate;
    private String bookCode;

    public LibraryCard(String name, String code, String dateOfBirth, String classs, String borrowCode,
                        String borrowDate, String returnDate, String bookCode) {
        super(name, code, dateOfBirth, classs);
        this.borrowCode = borrowCode;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.bookCode = bookCode;
    }

    public String getBorrowCode() {
        return borrowCode;
    }

    public void setBorrowCode(String borrowCode) {
        this.borrowCode = borrowCode;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString(){
        return "Ten: " + name + "\n" +
                "Ma sinh vien: " + code + "\n" +
                "Ngay sinh: " + dateOfBirth + "\n" +
                "Lop: " + classs + "\n" + 
                "So phieu muon: " + borrowCode + "\n" +
                "Ngay muon: " + borrowDate + "\n" +
                "Ngay tra: " + returnDate + "\n" +
                "So hieu sach: " + bookCode + "\n" +
                "----------------------\n";
    }
}
