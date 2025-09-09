package kh.edu.istad.classandobject.oop;

public class NonArgumentAndParameterConstructorPerson {
    public static void main(String[] args) {
        // Static constructor
        Person p1 = new Person();
        // Dynamic constructor
        Person p2 = new Person("Menglong", "Male", 1.75, false);
    }
}
