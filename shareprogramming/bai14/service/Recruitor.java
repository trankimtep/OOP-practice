package bai14.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bai14.entities.GoodStudent;
import bai14.entities.NomalStudent;
import bai14.entities.Student;

public class Recruitor {

    private int amount;

    public static ArrayList<Student> students = new ArrayList<Student>();
    static {
        students.add(new GoodStudent("Nguyen Van A", "01/01/2001", "Male", "0901234567", "PTIT", "Good", "3.9", "chicken blood cutting"));
        students.add(new GoodStudent("Nguyen Van B", "01/01/2001", "Male", "0901234567", "PTIT", "Good", "4.0", "duck blood cutting"));
        students.add(new GoodStudent("Nguyen Van C", "01/01/2001", "Male", "0901234567", "PTIT", "Good", "3.9", "chicken blood cutting"));
        students.add(new NomalStudent("Tran Van D", "01/02/2001", "Female", "0981236547", "PTIT", "Nomal", "900", "1"));
        students.add(new NomalStudent("Tran Van E", "01/02/2001", "Female", "0981236547", "PTIT", "Nomal", "800", "2"));
        students.add(new NomalStudent("Tran Van F", "01/02/2001", "Female", "0981236547", "PTIT", "Nomal", "900", "1"));
    }

    public ArrayList<Student> newEmployees = new ArrayList<Student>();

    public Recruitor () {}

    public Recruitor (int amount) {
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getGoodAmount() {
        int count = 0;
        for (Student student : students) {
            if (student instanceof GoodStudent) {
                count ++;
            }
        }
        return count;
    }

    public int getNomalAmount() {
        int count = 0;
        for (Student student : students) {
            if (student instanceof NomalStudent) {
                count ++;
            }
        }        
        return count;
    }

    public void recruit(){
        

    } 

}
