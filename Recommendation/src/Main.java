import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter temperature: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("You can ski.");
        } else if (heat <= 15) {
            System.out.println("You can go to cinema.");
        } else if (heat <= 25) {
            System.out.println("You can picnic");
        } else {
            System.out.println("You can swim.");
        }

    }
}
