import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sellingPrice;
        double taxAmount;
        double price;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter price value without tax: ");
        price = input.nextDouble();

        taxAmount = price * 0.18;
        sellingPrice = price + taxAmount;

        System.out.println("Price without tax: " + price );
        System.out.println("Price with tax: " + sellingPrice);
        System.out.println("Tax amount: " + taxAmount);

    }
}
