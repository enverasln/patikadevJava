import java.util.Scanner;

public class Main {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        double radius;
        double perimeter;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter radius of the circle: ");
        radius = input.nextDouble();

        // Calculate the perimeter
        perimeter = 2 * radius * PI;

        // Calculate the area
        area = radius * radius * PI;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
