package kh.edu.istad.controlflow;

public class ExpressionDemo {
    /**
     * main function is an <b style="color:red;">entrypoint</b> of any standalone Java application
     * you can initialize every object inside main function
     *
     * @param args is default argument
     * @author Menglong
     * @since 2025
     */
    public static void main(String[] args) {
        // age = 18 is the default business requirement
        // you can change to any value
        int age = 18; // This full statement called Expression(Syntax)
        /*
        if age>=18, means adult
        if age>=18 and age>=22, means you are adult and should find a job
        else, means kid
         */
        if (age >= 18) {
            System.out.println("You are an adult");
            if (age >= 22) {
                System.out.println("You should find a job");
            }
        } else {
            System.out.println("You are a kid");
        }
    }
}
