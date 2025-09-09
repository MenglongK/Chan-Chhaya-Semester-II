public class DemoBoxing {
    public static void main(String[] args) {
        double average = 90.5;
        int finalAverage = (int) average;
        System.out.println(finalAverage);

        long meter = 1000;
        int finalMeter = (int) meter; // Casting
        System.out.println(finalMeter);

        double score = 34.34;
        float finalScore = (float) score; // Casting

        int age = 18;
        long finalAge = age; // promotion
        System.out.println(finalAge);

        float money = 34.53F;
        double finalMoney = money; // promotion
        System.out.println(finalMoney);

        int speed = 60;
        Integer finalSpeed = speed; // Autoboxing by javaCompiler
        int updatedSpeed = finalSpeed; // Auto_Unboxing by javaCompiler
        System.out.println(speed);
        System.out.println(finalSpeed);
        System.out.println(updatedSpeed);
    }
}
