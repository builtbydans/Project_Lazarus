package MOOC_Part1_6_Conditionals;

import java.util.Scanner;

public class Positivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println("This number is positive");
        } else {
            System.out.println("This number is negative");
        }
    }
}
