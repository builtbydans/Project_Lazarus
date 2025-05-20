package MOOC_Part2_3_MoreLoops;

import java.util.Scanner;

public class WhereTo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to?" );
        int userInput1 = scanner.nextInt();
        System.out.print("Where from?" );
        int userInput2 = scanner.nextInt();

        for (int i = userInput2; i <= userInput1; i++) {
            System.out.println(i);
        }

    }
}
