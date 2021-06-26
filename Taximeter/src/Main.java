import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km;
        double pricePerKm = 2.20;
        double totalPrice;
        double startingPrice = 10.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter distance as km: ");

        km = input.nextDouble();

        totalPrice = startingPrice + km * pricePerKm;

        System.out.println("Total price: " + totalPrice + "₺.");
        System.out.println("Starting price: " + startingPrice + "₺.");


    }
}
