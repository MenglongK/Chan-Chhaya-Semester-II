package ControlFlow;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class SumAndAvgOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total subject: ");
        int totalSubject = Integer.parseInt(scan.nextLine());
        System.out.println("----------------------------");
        System.out.println("Total subject: " + totalSubject);
        double[] scores = new double[totalSubject];
        double totalScore = 0;
        for (int i = 0; i < totalSubject; i++) {
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = Double.parseDouble(scan.nextLine());
            totalScore += scores[i];
        }
        double average = totalScore / totalSubject;
        System.out.println("Score by subject: " + Arrays.toString(scores));
        System.out.println("Total score: " + BigDecimal.valueOf(totalScore).setScale(2, RoundingMode.HALF_UP));
        System.out.printf("Total average: %.2f", average);
    }
}
