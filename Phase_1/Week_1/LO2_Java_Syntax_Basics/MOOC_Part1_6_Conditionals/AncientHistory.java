package MOOC_Part1_6_Conditionals;

import java.util.Scanner;

public class AncientHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a year");
        int num = scanner.nextInt();

        if (num < 2015) {
            System.out.println("Ancient History!");
        }
    }
}
