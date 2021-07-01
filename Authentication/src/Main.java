import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, choice, newPassword;

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        username = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if(username.equals("patika") && password.equals("java123")) {
            System.out.println("Login is successful");
        }else {
            System.out.println("Entered information is invalid!");
            System.out.print("Do you want to reset password? (y/n)");
            choice = input.nextLine();
            if(choice.equals("Y") || choice.equals("y")) {
                System.out.print("New password: ");
                newPassword = input.nextLine();
                if(newPassword.equals("java123")) {
                    System.out.println("Password was not created. Please enter different password.");
                } else {
                    System.out.print("Password is created!");
                }
            }

        }



    }
}
