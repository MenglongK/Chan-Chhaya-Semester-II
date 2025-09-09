package kh.edu.istad.calculatorandexercise;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter total number: ");
        int totalNumber = Integer.parseInt(scan.nextLine());
        System.out.println("----------------------------");
        System.out.println("Total number: " + totalNumber);
        double[] number = new double[totalNumber];
        double max = number[0];
        double min = number[0]; // profit one round due number had assign to min & max
        for (int i = 1; i < totalNumber; i++) {
            System.out.print("Enter number " + (i + 1) + " :");
            number[i] = Double.parseDouble(scan.nextLine());
            if (max < number[i]) {
                max = number[i];
            }
            if (min < number[i]) {
                min = number[i];
            }
        }
//        for (int i = 0; i < totalNumber; i++) {
//
//        }
        System.out.printf("Max number: %.0f\n", max);
        System.out.printf("Min number: %.0f", min);
    }
}
