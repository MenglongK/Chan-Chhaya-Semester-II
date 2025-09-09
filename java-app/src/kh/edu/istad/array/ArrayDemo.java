package kh.edu.istad.array;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] studentNames = {"long", "love", "like"};
        studentNames = new String[3];
        studentNames[0] = "Tola";
        studentNames[1] = "Long";
        studentNames[2] = "Dara";
        // access all index
        System.out.println("Student name: " + Arrays.toString(studentNames));
        // access by index
        System.out.println("Index 0: " + studentNames[0]);
        System.out.println("Index 1: " + studentNames[1]);
        System.out.println("Index 2: " + studentNames[2]);

        // array index is out of bounds
        // System.out.println("Index 6: " + studentNames[6]);

        // to show total size of array
        System.out.println("Total array: " + studentNames.length);
    }
}
