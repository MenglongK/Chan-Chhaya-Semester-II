package CalculatorAndExercise;

import java.util.Scanner;

public class TriangleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value b: ");
        int b = scanner.nextInt();
        System.out.print("Enter value h: ");
        int h = scanner.nextInt();
        int result = (b * h) / 2;
        System.out.println();
        System.out.println("Area of triangle is: " + result);
    }
}
