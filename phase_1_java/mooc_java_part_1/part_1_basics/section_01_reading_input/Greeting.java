package MOOC_Part1_3_ReadingInput;

import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");

        String msg = scanner.nextLine();

        System.out.println("Hi " + msg);
    }
}