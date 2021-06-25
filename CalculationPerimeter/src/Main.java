import java.util.Scanner;

/**
 * @author Enver ASLAN, 25/06/2021
 * This program calculates the perimeter and hypotenuse length of right triangle
 */
public class Main {
    public static void main(String[] args) {
        double edge1, edge2, hyp, perimeter ,area;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter length of first edge: ");
        edge1 = input.nextDouble();

        System.out.print("Please enter length of second edge: ");
        edge2 = input.nextDouble();

        hyp = Math.sqrt(edge1 * edge1 + edge2 * edge2);
        perimeter = edge1 + edge2 + hyp;

        area = edge1 * edge2 / 2;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("Length of hypotenuse: " + hyp);

    }
}
