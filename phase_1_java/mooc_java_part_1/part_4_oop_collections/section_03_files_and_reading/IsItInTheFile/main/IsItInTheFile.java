package main;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        String searchQuery = "part_4_oop_collections/section_03_files_and_reading/IsItInTheFile/" + file;

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner reader = new Scanner(Paths.get(searchQuery))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                if (row.contains(searchedFor)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
