package kh.edu.istad.controlflow;

import java.util.Scanner;

public class WhileLoopMenuOption {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Enter menu: ");
            String menu = scan.nextLine();
            switch (menu) {
                case "A", "a" -> {
                    System.out.println("You choose menu A");
                    System.out.println("Pizza");
                }
                case "B", "b" -> {
                    System.out.println("You choose menu B");
                    System.out.println("Hamburger");
                }
                case "X", "x" -> System.exit(0); // On status we can use other value but only Integer
                default -> System.out.println("Invalid menu...!");
            }
        }
    }
}
// While loop check condition before run code
// Do-while loop at lease one statement is run
