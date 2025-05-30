package MOOC_Part2_1_RecurringProblems;

import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")) {
                System.out.println("No worries, goodbye!");
                break;
            }
        }

    }
}
