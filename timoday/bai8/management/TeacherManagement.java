package timoday.bai8.management;

import java.util.ArrayList;
import java.util.Scanner;

import timoday.bai8.entity.Teacher;

public class TeacherManagement {

    public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();

    public void addTeacher(Scanner scanner) {
        System.out.print("Ten: ");
        String name = scanner.nextLine();

        System.out.print("Ngay sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Que quan: ");
        String homeTown = scanner.nextLine();

        System.out.print("Luong cung: ");
        float gross = Float.valueOf(scanner.nextLine());

        System.out.print("Thuong: ");
        float bonus = Float.valueOf(scanner.nextLine());

        System.out.print("Phat: ");
        float mulct = Float.valueOf(scanner.nextLine());

        teachers.add(new Teacher(name, dateOfBirth, homeTown, gross, bonus, mulct));
        System.out.println("Added a new teacher!!");
    }

    public void displayAllTeacher() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void netOver8Milions() {
        ArrayList<Teacher> tem = new ArrayList<Teacher>();        
        for (Teacher teacher : teachers) {
            if (teacher.getNet() >= 8) {
                tem.add(teacher);
            }
        }
        if (tem.size() == 0) {
            System.out.println("Khong co giao vien nao co luong hon 8 trieu");
        } else {
            System.err.print("Cac giao vien co luong lon hon 8 trieu la: ");
            for (Teacher e : tem) {
                System.out.println(e.getName() + ", ");
            }
        }
        
    }
}
