package MOOC_Part1_3_ReadingInput;

import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message: ");

        String message = scanner.nextLine();

        System.out.println(message);
    }
}