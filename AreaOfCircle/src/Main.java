import java.util.Scanner;

public class Main {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        double radius;
        double area;
        double degree;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter radius of the circle: ");
        radius = input.nextDouble();

        System.out.print("Please enter the degree: ");
        degree = input.nextDouble();

        // Calculate the area
        area = radius * radius * PI * degree / 360;

        System.out.println("Area: " + area);
    }
}
