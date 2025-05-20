package MOOC_Part2_2_RepeatFunctionality;

import java.util.Scanner;

public class NumOfNegNums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberOfNegNums = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else {
                if (input < 0) {
                    numberOfNegNums++;
                }
            System.out.println(input);
            }
        }
        System.out.println("Number of negative numbers: " + numberOfNegNums);
    }
}
