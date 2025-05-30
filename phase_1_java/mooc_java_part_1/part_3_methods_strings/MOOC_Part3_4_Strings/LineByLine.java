package MOOC_Part3_4_Strings;

import java.util.Scanner;

public class LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.isBlank()) {
                break;
            }

            String[] chunks = input.split(" ");

            for (String chunk : chunks) {
                System.out.println(chunk);
            }
        }
    }
}
