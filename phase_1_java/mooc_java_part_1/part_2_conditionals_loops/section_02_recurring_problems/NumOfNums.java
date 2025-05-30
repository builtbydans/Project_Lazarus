package MOOC_Part2_1_RecurringProblems;

import java.util.Scanner;

public class NumOfNums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfNums = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else {
                System.out.println(input);
                numberOfNums = numberOfNums + 1;
            }
        }
        System.out.println("Number of numbers: " + numberOfNums);
    }
}
