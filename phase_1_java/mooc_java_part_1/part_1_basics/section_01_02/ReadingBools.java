package MOOC_Part1_4_Variables;

import java.util.Scanner;

public class ReadingBools {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write a boolean ");
            boolean value = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("You wrote " + value);
        }
}
