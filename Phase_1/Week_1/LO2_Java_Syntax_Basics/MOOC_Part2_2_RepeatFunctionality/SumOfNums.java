package MOOC_Part2_2_RepeatFunctionality;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNums = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else {
                sumOfNums += input;
            }
        }
            System.out.println("Sum of numbers: " + sumOfNums);
    }

}
