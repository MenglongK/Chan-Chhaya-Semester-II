package kh.edu.istad.classandobject.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    String fullName;
    String gender;
    LocalDate dob;
    double height;
    boolean isMarried;

    public Person() {
        fullName = "Default Name";
        gender = "Default gender";
        dob = LocalDate.now();
        height = 1;
        isMarried = false;
    }

    public Person(String fullName, String gender, double height, boolean isMarried) {
        // Used this for note fullName is take from class
        this.fullName = fullName;
        this.gender = gender;
        this.dob = LocalDate.now();
        this.height = height;
        this.isMarried = isMarried;
    }

    void displayDob() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy"); // DD day of year, YY week of year
        System.out.println("Date of birth: " + dob.format(formatter));
    }

    void displayInfo() {
        System.out.println("Full name: " + fullName);
        System.out.println("Gender: " + gender);
        displayDob();
        System.out.println("Height: " + height);
        System.out.println("Is married: " + isMarried);
    }
}
