package MOOC_Part1_6_Conditionals;

import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int num = scanner.nextInt();

        if (num == 1984) {
            System.out.println("Orwell!");
        }
    }
}
