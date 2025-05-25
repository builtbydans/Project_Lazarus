package MOOC_Part3_4_Strings;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        String user1 = "alex";
        String user2 = "emma";
        String pw1 = "sunshine";
        String pw2 = "haskell";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (userName.equals(user1) && password.equals(pw1) || userName.equals(user2) && password.equals(pw2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password combo");
        }
    }
}
