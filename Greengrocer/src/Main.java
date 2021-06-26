import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pearPrice = 2.14;
        double pearKg;

        double applePrice = 3.67;
        double appleKg;

        double tomatoPries = 1.11;
        double tomatoKg;

        double bananaPrice = 0.95;
        double bananaKg;

        double eggPlantPrice = 5.00;
        double eggPlantKg;

        double totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.print("Kilograms of pear: ");
        pearKg = input.nextDouble();

        System.out.print("Kilograms of apple: ");
        appleKg = input.nextDouble();

        System.out.print("Kilograms of tomato: ");
        tomatoKg = input.nextDouble();

        System.out.print("Kilograms of banana: ");
        bananaKg = input.nextDouble();

        System.out.print("Kilograms of eggplant: ");
        eggPlantKg = input.nextDouble();

        totalPrice = pearPrice * pearKg;
        totalPrice += applePrice * appleKg;
        totalPrice += tomatoPries * tomatoKg;
        totalPrice += bananaPrice * bananaKg;
        totalPrice += eggPlantPrice * eggPlantKg;

        System.out.println("Total price: " + totalPrice);
    }
}
