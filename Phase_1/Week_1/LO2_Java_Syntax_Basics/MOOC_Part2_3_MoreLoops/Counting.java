package MOOC_Part2_3_MoreLoops;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        for (int i = 0; i <= userInput; i++) {
            System.out.println(i);
        }
    }
}
