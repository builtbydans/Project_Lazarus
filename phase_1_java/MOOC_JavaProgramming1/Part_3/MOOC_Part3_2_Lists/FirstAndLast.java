package MOOC_Part3_2_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

            nameList.add(input);
        }

        System.out.println(nameList.get(0));
        System.out.println(nameList.get(nameList.size() - 1));
    }
}
