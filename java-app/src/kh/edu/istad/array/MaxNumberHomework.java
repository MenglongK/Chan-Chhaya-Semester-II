package kh.edu.istad.array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumberHomework {
    public static void main(String[] args) {
        System.out.println("Find max value of 3 values");
        System.out.println("==========================");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value of v1 -> ");
        int v1 = scan.nextInt();
        System.out.print("Enter value of v2 -> ");
        int v2 = scan.nextInt();
        System.out.print("Enter value of v3 -> ");
        int v3 = scan.nextInt();
        System.out.println("==========================");
        int[] totalValue = {v1, v2, v3};
        System.out.println("\nTotal values are: " + Arrays.toString(totalValue));
        System.out.println("==========================");
        if (v1 > v2 && v1 > 3) System.out.println("\nMax value is v1 => " + v1);
        else if (v2 > v1 && v2 > v3) System.out.println("\nMax value is v2 => " + v2);
        else System.out.println("\nMax value is v3 => " + v3);
        System.out.println("==========================");
    }

}
