package MOOC_Part3_4_Strings;

import java.util.Scanner;

public class PrintThrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a word: ");
        String input = scanner.nextLine();

        System.out.println(input.repeat(3));
    }
}
