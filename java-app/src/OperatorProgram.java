import java.util.Scanner;

public class OperatorProgram {
    public static void main(String[] args) {
        System.out.print("Enter value a: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.print("Enter value b: ");
        int y = scanner.nextInt();

        int sum = x + y;
        int subtraction = x - y;
        int multiply = x * y;
        int divide = x / y;
        int remainder = x % y;

        System.out.println();

        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiply: " + multiply);
        System.out.println("Divide: " + divide);
        System.out.println("Remainder: " + remainder);
    }
}