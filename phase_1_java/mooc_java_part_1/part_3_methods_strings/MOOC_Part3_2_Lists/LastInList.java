package MOOC_Part3_2_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {
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

        System.out.println("Last name: " + nameList.get(nameList.size() - 1));
    }
}
