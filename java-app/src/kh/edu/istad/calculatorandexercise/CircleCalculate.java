package kh.edu.istad.calculatorandexercise;

import java.util.Scanner;

public class CircleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value r: ");
        int r = scanner.nextInt();
        final double PI = Math.PI;
        double result = PI * (r * r);
        System.out.println();
        System.out.printf("Area of circle is: %.2f", result);
    }
}
