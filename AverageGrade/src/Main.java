import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float mat, phy, chem, tur, his, mus;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter you grade for Mathematics: ");
        mat = input.nextFloat();

        System.out.print("Please enter your grade for Physics: ");
        phy = input.nextFloat();

        System.out.print("Please enter your grade for Chemistry: ");
        chem = input.nextFloat();

        System.out.print("Please enter your grade for Turkish: ");
        tur = input.nextFloat();

        System.out.print("Please enter your grade for History: ");
        his = input.nextFloat();

        System.out.print("Please enter your grade for Music: ");
        mus = input.nextFloat();

        float avg = (mat + phy + chem + tur + his + mus) / 6.0f;

        System.out.println("Your average grade is " + avg);
        System.out.println(avg > 60 ? "Success" : "Fail");
    }
}
