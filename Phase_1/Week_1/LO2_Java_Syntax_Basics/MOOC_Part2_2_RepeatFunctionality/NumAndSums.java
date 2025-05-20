package MOOC_Part2_2_RepeatFunctionality;

import java.util.Scanner;

public class NumAndSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        int sumOfNums = 0;

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
        System.out.println("Num of numbers: " + numOfNums);
        System.out.println("Sum of numbers: " + sumOfNums);
    }

}
