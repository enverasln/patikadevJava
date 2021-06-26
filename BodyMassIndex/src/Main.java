import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double height;
        double weight;
        double bmi;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height (m): ");
        height = input.nextDouble();

        System.out.print("Please enter your weight (kg): ");
        weight = input.nextDouble();

        bmi = weight / (height * height);

        System.out.println("Your body mass index: " + bmi);
    }
}
