package it.app2ed;

import it.app2ed.model.Student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert firstname : ");
        String firstName = scanner.next();
        System.out.println("Insert lastname : ");
        String lastName = scanner.next();
        System.out.println("Insert date birthday: ");
        String dateBirthday = scanner.next();
        Date date = new Date();
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = sdf.parse(dateBirthday);
        } catch (Exception e) {
            System.out.println("Error date");
        }
        Student firstStudent = new Student();
        firstStudent.setFirstname(firstName);
        firstStudent.setLastname(lastName);
        System.out.println("Insert number total grades: ");
        int numberGrades = scanner.nextInt();
        firstStudent.getAverageGrade(numberGrades);
        System.out.println(firstStudent.getFirstname() + "\n" + firstStudent.getLastname()
                + "\n" + firstStudent.getAge(date) + " years");

    }
}
