package MOOC_Part2_3_MoreLoops;

import java.util.Scanner;

public class SumOfSequence2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("First num?");
        int num1 = scanner.nextInt();

        System.out.println("Last num?");
        int num2 = scanner.nextInt();

        for (int i = num1; i <= num2; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);

    }
}
