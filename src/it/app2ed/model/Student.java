package it.app2ed.model;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import static java.util.Calendar.*;

public class Student {
    private String firstname;
    private String lastname;
    private String birthdate;
    private double grades;

    public Student() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }

    public int getAge(Date birthDate) {
        Calendar calendarBirthDay = Calendar.getInstance();
        calendarBirthDay.setTime(birthDate);
        Calendar calendarToday = Calendar.getInstance();
        int age = calendarToday.get(YEAR) - calendarBirthDay.get(YEAR);
        if (calendarBirthDay.get(MONTH) > calendarToday.get(MONTH) ||
                (calendarBirthDay.get(MONTH) == calendarToday.get(MONTH) &&
                        calendarBirthDay.get(DATE) > calendarToday.get(DATE))) {
            age--;
        }
        return age;
    }

    public int[] getAverageGrade(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Insert grade: " + "number " + (i + 1));
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int x : array)
            sum += x;
        double average = (double) sum / n;
        System.out.println("The average is : " + average);
        return array;
    }
}

