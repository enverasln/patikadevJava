import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, choice;
        double result;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        num1 = input.nextInt();

        System.out.print("Please enter second number: ");
        num2 = input.nextInt();

        System.out.print("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division\nChoice:");
        choice = input.nextInt();

        result = switch (choice) {
            case 1 -> num1 + num2;
            case 2 -> num1 - num2;
            case 3 -> num1 * num2;
            default -> num1 * 1.0 / num2;
        };

        System.out.println("Result: " + result);
    }
}
