package ControlFlow;

import java.util.Scanner;

public class ForLoopBasic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Java have fun...!" + (i + 1));
        }
    }
}
