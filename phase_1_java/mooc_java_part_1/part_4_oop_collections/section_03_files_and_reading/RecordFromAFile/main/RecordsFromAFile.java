package main;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file: ");
        String input = scanner.nextLine();

        String searchQuery = "part_4_oop_collections/section_03_files_and_reading/RecordFromAFile/" + input;

        try (Scanner reader = new Scanner(Paths.get(searchQuery))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();

                String[] parts = row.split(",");
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());

                if (age == 1) {
                    System.out.printf("%s, age: %d year\n", name, age);
                } else {
                    System.out.printf("%s, age: %d years\n", name, age);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error reading file or parsing age: " + e.getMessage());
        }
    }
}
