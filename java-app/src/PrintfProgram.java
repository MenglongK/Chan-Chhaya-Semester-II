public class PrintfProgram {
    public static void main(String[] args) {
        String name = "Menglong";
        String gender = "Male";
        String dob = "22-12-2000";
        String career = "Developer";
//        System.out.printf("Hello, %s%n", "printf");
//        System.out.printf("Hello, %s%n", name);
//        System.out.println("Hello, " + "Dara");
//        System.out.println("Hello, " + name);
        System.out.printf("Hello, %s, %s, %s, %s%n", name, gender, dob, career);
        System.out.println("Hello, " + name + ", " + gender + ", " + dob + ", " + career);
        System.out.printf("Hello, %s, %s, %d, %.2f", name, gender, 25, 3700.01);
    }
}
