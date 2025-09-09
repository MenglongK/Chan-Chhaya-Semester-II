package kh.edu.istad.controlflow;

import java.util.Scanner;

public class DoWhileLoopBasicLogic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isNumber = true;
        do {
            System.out.print("Enter number: ");
            try {
                int number = Integer.parseInt(scan.nextLine());
                if (number == 4) {
                    continue;
                }
                if (number == 13) {
                    break;
                }
                System.out.println("Your number is: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Number format error " + e.getMessage()); // optional
                System.out.print("Continue or exit: ");
                String input = scan.nextLine();
                if (input.equalsIgnoreCase("Y")) {
                    continue;
                } else {
                    System.out.println("exit");
                }
                isNumber = false;
            } // e is exception, optional for called to use

        } while (isNumber);
    }
}
// at lease one statement (Enter number:) is run
// While loop check condition before run code