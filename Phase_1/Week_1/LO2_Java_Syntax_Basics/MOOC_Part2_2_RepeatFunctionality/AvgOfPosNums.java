package MOOC_Part2_2_RepeatFunctionality;

import java.util.Scanner;

public class AvgOfPosNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfNums = 0;
        int sumOfNums = 0;
        double result;

        while (true) {
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            } else {
                if (input > 0) {
                    numOfNums += 1;
                    sumOfNums += input;
                }
            }
        }
        result = ((double) sumOfNums / numOfNums);

        if (sumOfNums <= 0) {
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(result);
        }
    }

}
