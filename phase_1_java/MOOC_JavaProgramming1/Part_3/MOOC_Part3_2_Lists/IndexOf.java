package MOOC_Part3_2_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
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

        System.out.print("Search for: ");
        int searchNum = scanner.nextInt();

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == searchNum) {
                System.out.println(searchNum + " is at index " + i);
            }
        }
    }
}
