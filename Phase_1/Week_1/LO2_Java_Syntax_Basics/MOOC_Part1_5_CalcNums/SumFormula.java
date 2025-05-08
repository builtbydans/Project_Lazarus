package MOOC_Part1_5_CalcNums;

import java.util.Scanner;

public class SumFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println(first + " + " + second + " = " + (first + second));
    }
}
