package MOOC_Part2_1_RecurringProblems;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your first number:");
        int num1 = scanner.nextInt();

        System.out.println("Your second number:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println((int)Math.sqrt(sum));
    }
}
