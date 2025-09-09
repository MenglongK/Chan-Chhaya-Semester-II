package kh.edu.istad.classandobject.oop;

public class OOPAppBicycle {
    public static void main(String[] args) {
        Bicyble b1 = new Bicyble();
        b1.brand = "Giant";
        b1.gear = 5;
        Bicyble b2 = new Bicyble();
        b2.brand = "B2 Spirit";
        b2.gear = 3;
        System.out.println(b1.brand + ", Gear: " + b1.gear);
        System.out.println(b2.brand + ", Gear: " + b2.gear);
        b1.braking();
        b2.braking();
    }
}