package MOOC_Part2_1_RecurringProblems;

import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("The number to be squared:");
        int num = scanner.nextInt();

        System.out.println(num * num);
    }
}
