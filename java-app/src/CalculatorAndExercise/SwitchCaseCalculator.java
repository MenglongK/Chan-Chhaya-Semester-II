package CalculatorAndExercise;

import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value1: ");
        double value1 = scan.nextDouble();
        System.out.print("Enter operator(+, -, *, /) ");
        scan.nextLine();
        String operator = scan.nextLine();
        System.out.print("Enter value2: ");
        double value2 = scan.nextDouble();
        System.out.printf("Calculate operation: %.0f %s %.0f%n", value1, operator, value2);
        switch (operator) {
            case "+" -> System.out.printf("Result: %.0f", (value1 + value2));
            case "-" -> System.out.printf("Result: %.0f", (value1 - value2));
            case "*" -> System.out.printf("Result: %.0f", (value1 * value2));
            case "/" -> {
                if (value2 == 0) {
                    System.out.println("Error divide by zero");
                } else {
                    System.out.printf("Result: %.0f", (value1 / value2));
                }
            }
            default -> System.out.println("Invalid operator..!");
        }
    }
}
