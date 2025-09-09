package ControlFlow;

import java.util.Scanner;

public class DemoSwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter menu: ");
        int menu = scan.nextInt();

       /*  switch (menu) {

            ======= Old syntax ===== no need (break;) keyword
            case 1:
                System.out.println("You choose menu #1");
                break;
            case 2:
                System.out.println("You choose menu #2");
                break;
            default:
                System.out.println("You choose default menu");



            ====== New Syntax ====== no (break;)
            case 1 -> System.out.println("You choose menu #1");
            case 2 -> System.out.println("You choose menu #2");
            default -> System.out.println("You choose default menu");

        } */

        // New syntax call assign value to variable

        String option = switch (menu) {
            case 1 -> {
                // todo
                System.out.println("Choose menu #1");
                yield "M1";
            }
            case 2 -> "M2";
            default -> "MD";
        };
        System.out.println("You choose menu" + option);
    }

}

