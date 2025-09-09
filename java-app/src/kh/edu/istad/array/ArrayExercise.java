package kh.edu.istad.array;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Dara";
        names[1] = "Vicheka";
        names[2] = "Tola";

        String[] gender = new String[3];
        gender[0] = "Male";
        gender[1] = "Female";
        gender[2] = "Male";

        double[] scores = new double[3];
        scores[0] = 99.95;
        scores[1] = 90.45;
        scores[2] = 96.67;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student index -> ");
        int index = scanner.nextInt();
        System.out.println("Input index is " + index);
        System.out.println("--------[RESULT-------");

        /*
        if (index == 1) {
            System.out.println("Studnet name: " + names[0]);
            System.out.println("Studnet gender: " + gender[0]);
            System.out.println("Studnet score: " + scores[0]);
        } else if (index == 2) {
            System.out.println("Studnet name: " + names[1]);
            System.out.println("Studnet gender: " + gender[1]);
            System.out.println("Studnet score: " + scores[1]);
        } else if (index == 3) {
            System.out.println("Studnet name: " + names[2]);
            System.out.println("Studnet gender: " + gender[2]);
            System.out.println("Studnet score: " + scores[2]);
        }
         */
        try {
            System.out.println("Student name: " + names[index - 1]);
            System.out.println("Student gender: " + gender[index - 1]);
            System.out.println("Student score: " + scores[index - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // e to get message error of ArrayIndexOutOfBoundsException data type
            // System.out.println(e.getMessage());
            System.out.println("Please enter correct index");
        }
    }
}