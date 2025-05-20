package MOOC_Part2_3_MoreLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int factorial = 1;

        System.out.println("First num?");
        int num1 = scanner.nextInt();

        for (int i = 1; i <= num1; i++) {
           factorial *= i;
        }

        System.out.println("Factorial: " + factorial);

    }
}
