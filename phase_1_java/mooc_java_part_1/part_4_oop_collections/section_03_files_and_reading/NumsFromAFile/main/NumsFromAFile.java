package main;

import java.nio.file.Paths;
import java.util.Scanner;

public class NumsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to search for: ");
        String input = scanner.nextLine();

        String searchQuery = "part_4_oop_collections/section_03_files_and_reading/NumsFromAFile/" + input;

        System.out.print("Lower Bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Upper Bound: ");
        int upperBound = scanner.nextInt();

        int counter = 0;

        try (Scanner reader = new Scanner(Paths.get(searchQuery))) {

            while (reader.hasNextLine()) {
                int row = Integer.parseInt(reader.nextLine());

                if (row >= lowerBound &&  row <= upperBound) {
                    counter++;
                }
            }

            System.out.println("Numbers in range: " + counter);

        } catch (Exception e) {
            System.out.println("Could not find file: " + input);
        }
    }
}
