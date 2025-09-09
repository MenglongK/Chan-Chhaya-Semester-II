package kh.edu.istad.classandobject.oop;

import java.time.LocalDate;

public class OOPAppPerson {
    public static void main(String[] args) {
        Person p1 = new Person(); // Person() is constructor had create by default
        p1.fullName = "Menglong";
        p1.gender = "Male";
        p1.height = 1.75;
        p1.isMarried = false;
        p1.dob = LocalDate.of(2000, 12, 22);
        Person p2 = new Person();
        p2.fullName = "May";
        p2.gender = "Female";
        p2.height = 1.6;
        p2.isMarried = false;
        p2.dob = LocalDate.of(1999, 6, 20);
        p1.displayInfo();
        System.out.println("==========================");
        p2.displayInfo();
    }
}
