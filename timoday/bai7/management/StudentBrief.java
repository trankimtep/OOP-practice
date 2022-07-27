package timoday.bai7.management;

import java.util.ArrayList;
import java.util.Scanner;

import timoday.bai7.entity.Student;

public class StudentBrief {

    public static ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Scanner scanner) {
        System.out.print("Ten: ");
        String name = scanner.nextLine();

        System.out.print("Ngay sinh: ");
        String dateOfBirth = scanner.nextLine();

        System.out.print("Que quan: ");
        String homeTown = scanner.nextLine();

        System.out.print("Lop: ");
        String inClass = scanner.nextLine();

        System.out.print("Khoa hoc: ");
        String course = scanner.nextLine();

        System.out.print("Ki hoc: ");
        String term = scanner.nextLine();

        students.add(new Student(name, dateOfBirth, homeTown, inClass, course, term));
    }

    public void thaiNguyen1985 () {
        for (Student student : students) {
            if (student.getYearOfBirth().equals("1985") && student.getHomeTown().equals("Thai Nguyen")) {
                System.out.println(student);
                System.out.println("");
            }
        }
    }

    public void lop10A1 () {
        for (Student student : students) {
            if (student.getInClass().equals("10A1")) {
                System.out.println(student);
                System.out.println("");
            }
        }
    }
}
