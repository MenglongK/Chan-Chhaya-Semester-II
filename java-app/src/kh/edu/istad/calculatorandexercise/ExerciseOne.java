package kh.edu.istad.calculatorandexercise;

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a = scanner.nextInt();
        System.out.print("Enter value b: ");
        int b = scanner.nextInt();
        int result = (2 * (a * a) + 2 * (b * b));
        System.out.println();
        System.out.println("Result is: " + result);
    }
}
