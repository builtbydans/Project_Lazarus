package main;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);

        if (!records.isEmpty()) {
            System.out.println("Persons: " + records.size());
            System.out.println("Persons:");
        }

        for (Person person : records) {
            System.out.println(person);
        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        String searchQuery = "part_4_oop_collections/section_03_files_and_reading/StoringRecords/" + file;

        try (Scanner reader = new Scanner(Paths.get(searchQuery))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();

                String[] parts = row.split(",");
                String name = parts[0].trim();
                int age = Integer.parseInt(parts[1].trim());

                persons.add(new Person(name, age));
            }

        } catch (Exception e) {
            System.out.println(file + " does not exist. Program terminated.");;
        }

        return persons;
    }
}
