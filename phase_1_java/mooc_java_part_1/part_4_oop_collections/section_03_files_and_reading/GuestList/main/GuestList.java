package main;


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        String search = "part_4_oop_collections/section_03_files_and_reading/GuestList/" + file;

        ArrayList<String> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(search))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                list.add(row);
            }
        } catch (Exception e) {
            System.out.println("Unable to find file named: " + search);
        }

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isBlank()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Program terminated. Thank you!");
    }
}

