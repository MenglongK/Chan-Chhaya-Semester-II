package kh.edu.istad.controlflow;

import java.util.Scanner;

public class GuessPeopleType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter fullname: ");
        String fullName = scan.nextLine();
        System.out.println("Your fullname is: " + fullName);
        String[] charactor = fullName.split("");
//        System.out.print("All charactor: " + Arrays.toString(charactor));
        int sumChar = 0;
        for (int i = 0; i < charactor.length; i++) {
//            System.out.println("char " + charactor[i]);
            switch (charactor[i]) {
                case "a", "j", "s", "A", "J", "S" -> sumChar = sumChar + 1; // sumChar +=1
                case "b", "k", "t", "B", "K", "T" -> sumChar += 2;
                case "c", "l", "u", "C", "L", "U" -> sumChar += 3;
                case "d", "m", "v", "D", "M", "V" -> sumChar += 4;
                case "e", "n", "w", "E", "N", "W" -> sumChar += 5;
                case "f", "o", "x", "F", "O", "X" -> sumChar += 6;
                case "g", "p", "y", "G", "P", "Y" -> sumChar += 7;
                case "h", "q", "z", "H", "Q", "Z" -> sumChar += 8;
                case "i", "r", "I", "R" -> sumChar += 9;
                default -> sumChar += 0;
            }
            // Teacher code
            /*   for (int i = 0; i < fullName.length(); i++) {
            sum += switch (fullName.toLowerCase().charAt(i)) {
                case 'a', 'j', 's' -> 1;
                case 'b', 'k', 't' -> 2;
                case 'c', 'l', 'u' -> 3;
                case 'd', 'm', 'v' -> 4;
                case 'e', 'n', 'w' -> 5;
                case 'f', 'o', 'x' -> 6;
                case 'g', 'p', 'y' -> 7;
                case 'h', 'q', 'z' -> 8;
                case 'i', 'r' -> 9;
                default -> 0;
            };
            } */
            while (sumChar > 9) {
                sumChar = (sumChar % 10) + (sumChar / 10);
            }

            /* System.out.println("Results: " + sumChar);
            String splitSumChar = Integer.toString(sumChar);
            int divideSumChar1 = sumChar / 10;
            int monoloSumChar1 = sumChar % 10;
            int total = divideSumChar1 + monoloSumChar1;
            System.out.println(total);
            String splitSumCharAgain = Integer.toString(total);
            int divideSumChar2 = total / 10;
            int monoloSumChar2 = total % 10;
            int result = divideSumChar2 + monoloSumChar2;
            System.out.println(result); */
        }
        System.out.println("You chapter number is: " + sumChar);
    }
}
