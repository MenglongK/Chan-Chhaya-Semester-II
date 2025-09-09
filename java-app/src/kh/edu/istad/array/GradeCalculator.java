package kh.edu.istad.array;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter numerical grade (0-100): ");
        double score = scan.nextDouble();
        System.out.println("--------[Result]---------");
        System.out.println("Scores: " + score);
        if (score <= 100 && score >= 0) {
            if (score >= 90 && score <= 100) {
                System.out.println("Grade: A");
            } else if (score >= 80) {
                System.out.println("Grade: B");
            } else if (score >= 70) {
                System.out.println("Grade: C");
            } else if (score >= 60) {
                System.out.println("Grade: D");
            } else if (score < 60 && score >= 0) {
                System.out.println("Grade: F");
            }
        } else {
            System.out.println("Numerical must between (0-100)! input again!");
        }

    }
}
