package MOOC_Part3_2_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true) {
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            nameList.add(name);
        }

        System.out.print("Search for? ");
        String input = scanner.nextLine();

        if (nameList.contains(input)) {
            System.out.println(input + " was found!");
        } else {
            System.out.println(input + " was not found!");
        }
    }
}
