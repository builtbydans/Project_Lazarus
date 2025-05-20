package MOOC_Part2_3_MoreLoops;

import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Last number?");
        int input = scanner.nextInt();

        for (int i = 1; i <= input; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);

    }
}
