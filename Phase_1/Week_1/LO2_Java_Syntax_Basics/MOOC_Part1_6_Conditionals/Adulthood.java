package MOOC_Part1_6_Conditionals;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How old are you?");
        int num = scanner.nextInt();

        if (num >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}
