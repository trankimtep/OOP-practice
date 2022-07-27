package timoday.bai3.service;

import java.util.ArrayList;

import timoday.bai3.entity.Book;
import timoday.bai3.entity.Document;
import timoday.bai3.entity.Magazine;
import timoday.bai3.entity.NewsPaper;



public class DocManagement {
    public static ArrayList<Document> documents = new ArrayList<Document>();

    static{
        documents.add(new Book("1", "KimDong", "1000", "NoOne", 1000));
        documents.add(new Book("2", "KimDong", "1050", "SomeOne", 1000));
        documents.add(new Magazine("3", "KimDong", "1000", "1000", "June"));
        documents.add(new Magazine("4", "KimDong", "1000", "1200", "July"));
        documents.add(new NewsPaper("5", "KimDong", "1000", "Monday"));
        documents.add(new NewsPaper("6", "KimDong", "1000", "Tuesday"));
    }

    public void addDoc (Document document){
        documents.add(document);
    }

    public void findByCategory (String category){
        if (category == "Book"){
            for (Document book : documents){
                if (book instanceof Book) {
                    System.out.println(book);
                }
            }
        }

        if (category == "Magazine"){
            for (Document magazine : documents){
                if (magazine instanceof Magazine) {
                    System.out.println(magazine);
                }
            }
        }
        

        if (category == "NewsPaper"){
            for (Document newsPaper : documents){
                if (newsPaper instanceof NewsPaper) {
                    System.out.println(newsPaper);
                }
            }
        }
    }

    public void findByDocumentCode(String code) {
        for (Document document : documents){
            if (document.getDocumentCode() == code){
                System.out.println(document);
            }
        }
    }

}
