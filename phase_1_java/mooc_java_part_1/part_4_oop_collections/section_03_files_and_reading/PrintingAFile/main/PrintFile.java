package main;

import java.util.Scanner;
import java.nio.file.Paths;

public class PrintFile {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("part_4_oop_collections/section_03_files_and_reading/PrintingAFile/data.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
