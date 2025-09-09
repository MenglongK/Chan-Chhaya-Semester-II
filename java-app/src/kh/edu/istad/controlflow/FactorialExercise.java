package kh.edu.istad.controlflow;

import java.util.Scanner;

public class FactorialExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = Integer.parseInt(scan.nextLine());
        int mul = 1;
        for (int i = number; i > 0; i--) {
            mul *= i;
//            System.out.print(i + " * ");
            System.out.print(i + " * ");
        }
//        System.out.println("1 = " + mul);
        System.out.println("\b\b= " + mul); // \b: backspace to remove last
    }
}