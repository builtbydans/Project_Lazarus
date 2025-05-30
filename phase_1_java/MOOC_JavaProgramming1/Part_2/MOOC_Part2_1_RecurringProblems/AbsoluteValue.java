package MOOC_Part2_1_RecurringProblems;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your number:");
        int num1 = scanner.nextInt();

        if (num1 < 0) {
            System.out.println(num1 * -1);
        } else {
            System.out.println(num1);
        }
    }
}
