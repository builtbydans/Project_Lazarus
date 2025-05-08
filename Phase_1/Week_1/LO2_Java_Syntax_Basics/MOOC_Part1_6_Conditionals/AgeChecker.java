package MOOC_Part1_6_Conditionals;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        if (age >= 0 && age <= 120) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }

    }
}
