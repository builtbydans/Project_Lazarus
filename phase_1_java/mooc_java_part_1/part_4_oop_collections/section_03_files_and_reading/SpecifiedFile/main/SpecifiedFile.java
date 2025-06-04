package main;

import java.nio.file.Paths;
import java.util.Scanner;

public class SpecifiedFile {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");

        String input = reader.nextLine();

        String search = "part_4_oop_collections/section_03_files_and_reading/SpecifiedFile/" + input;

        try (Scanner scanner = new Scanner(Paths.get(search))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Unable to find file named: " + input);
        }

    }
}
