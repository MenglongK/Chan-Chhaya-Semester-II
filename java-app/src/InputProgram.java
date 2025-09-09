import java.util.Scanner;

public class InputProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.print("Enter your gender: ");
        String gender = scan.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scan.nextLine());
//        int age = scan.nextInt();
//        scan.nextLine();
        System.out.print("Enter your future career: ");
        String career = scan.nextLine();

        System.out.println();

        System.out.println("----------------------");
        System.out.println("Student's name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Career: " + career);
    }
}
