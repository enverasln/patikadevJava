import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mathematics, physics, turkish, chemistry, music;
        double avg;
        int size = 5;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Mathematics: ");
        mathematics = input.nextInt();
        if (mathematics < 0 || mathematics > 100) {
            size--;
        } else {
            sum += mathematics;
        }

        System.out.print("Physics: ");
        physics = input.nextInt();
        if (physics < 0 || physics > 100) {
            size--;
        } else {
            sum += physics;
        }

        System.out.print("Turkish: ");
        turkish = input.nextInt();
        if (turkish < 0 || turkish > 100) {
            size--;
        } else {
            sum += turkish;
        }

        System.out.print("Chemistry: ");
        chemistry = input.nextInt();
        if (chemistry < 0 || chemistry > 100) {
            size--;
        } else {
            sum += chemistry;
        }

        System.out.print("Music: ");
        music = input.nextInt();
        if (music < 0 || music > 100) {
            size--;
        } else {
            sum += music;
        }


        if (size == 0) {
            System.out.println("There is no grade for calculation!");
        } else {
            avg = sum*1.0 / size;
            if(avg >= 55) {
                System.out.println("You are successful.");
            } else {
                System.out.println("Yuo are fail");
            }
            System.out.println("Your average grease is " + avg);
        }



    }
}
