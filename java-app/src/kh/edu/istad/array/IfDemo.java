package kh.edu.istad.array;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number -> ");
        int number = scan.nextInt();
        if (number > 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        System.out.println("Good bye!");

        System.out.println("----------[New Exercise: To calcualate even or odd number]----------");

        System.out.print("Enter number -> ");
        int input = scan.nextInt();
        if (input % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");
    }
}