package MOOC_Part3_4_Strings;

import java.util.Scanner;
import java.util.ArrayList;

public class PersonalDetails {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();
        String longestName = "";
        int sumOfYears = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name and year of birth, separated by a comma. Example: sebastian,2017");

        while (true) {
            String input = scanner.nextLine();

            if (input.isBlank()) {
                break;
            }

            nameList.add(input);
        }

        for (String entry : nameList) {
            String[] parts = entry.split(",");
            String name = parts[0].trim();
            int birthYear = Integer.parseInt(parts[1].trim());

            // Update longest name if needed
            if (name.length() > longestName.length()) {
                longestName = name;
            }

            // Add to total and count
            sumOfYears += birthYear;
            count++;
        }

        double average = (double) sumOfYears / count;

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
