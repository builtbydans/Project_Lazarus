package MOOC_Part3_2_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            numList.add(input);
        }

        System.out.print("From where?: ");
        int from = scanner.nextInt();

        System.out.print("To where?: ");
        int to = scanner.nextInt();

        for (int i = from; i <= to; i++) {
            System.out.println(numList.get(i));
        }
    }
}
