package MOOC_Part1_4_Variables;

import java.util.Scanner;

public class ReadingInts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int answer = Integer.parseInt(scanner.nextLine());

        System.out.println("You gave the number: " + answer);
    }
}
