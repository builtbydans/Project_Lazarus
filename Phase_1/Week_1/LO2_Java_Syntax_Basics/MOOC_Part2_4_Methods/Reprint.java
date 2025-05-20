package MOOC_Part2_4_Methods;

import java.util.Scanner;

public class Reprint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many times?");
        int input = scanner.nextInt();
        int counter = 0;

        while (counter < input) {
            printText();
            counter++;
        }
    }

    public static void printText() {
        System.out.println("In the hole in the ground there lived a method");
    }
}
