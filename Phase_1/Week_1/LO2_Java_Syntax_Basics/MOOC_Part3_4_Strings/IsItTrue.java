package MOOC_Part3_4_Strings;

import java.util.Scanner;

public class IsItTrue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Give a string: ");
            String input = scanner.nextLine();

            if (input.trim().isBlank()) {
                System.out.println("input cannot be empty");
            } else if (!input.equals("true")) {
                System.out.println("Try again");
            } else {
                System.out.println("You got it right!");
                break;
            }
        }
    }
}
