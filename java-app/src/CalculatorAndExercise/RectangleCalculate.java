package CalculatorAndExercise;

import java.util.Scanner;

public class RectangleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value l: ");
        int l = scanner.nextInt();
        System.out.print("Enter value w: ");
        int w = scanner.nextInt();
        int result = l * w;
        System.out.println();
        System.out.println("Area of rectangle is: " + result);
    }
}
