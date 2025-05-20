package MOOC_Part2_1_RecurringProblems;

import java.util.Scanner;

public class AvgOfNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        int sumOfNums = 0;
        double result;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else {
                numOfNums += 1;
                sumOfNums += input;
            }
        }
        result = ((double) sumOfNums / numOfNums);
        System.out.println("Average of the numbers: " + result);
    }

}
