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

        switch (choice) {
            case 1:
                System.out.println("Result: " +  (num1 + num2));
                break;
            case 2:
                System.out.println("Result: " +  (num1 - num2));
                break;
            case 3:
                System.out.println("Result: " +  (num1 * num2));
                break;
            case 4:
                if(num2 == 0) {
                    System.out.println("Zero division problem.\nnum2 should not be 0");
                } else {
                    System.out.println("Result: " +  num1 / num2);
                }
                break;
            default:
                System.out.println("Wrong  choice!");
                break;
        }


    }
}
