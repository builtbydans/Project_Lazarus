package main;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File: ");
        String input = scanner.nextLine();

        String searchQuery = "part_4_oop_collections/section_03_files_and_reading/SportsStatistics/" + input;

        System.out.print("Team: ");
        String input2 = scanner.next();

        int gameCounter = 0;
        int winCounter = 0;
        int lossCounter = 0;

        try (Scanner reader = new Scanner(Paths.get(searchQuery))) {
            while (reader.hasNextLine()) {
                String row = reader.nextLine();

                String[] parts = row.split(",");
                String homeTeam = parts[0].trim();
                String awayTeam = parts[1].trim();
                int homePoints = Integer.parseInt(parts[2].trim());
                int awayPoints = Integer.parseInt(parts[3].trim());

                if (input2.equalsIgnoreCase(homeTeam) || input2.equalsIgnoreCase(awayTeam)) {
                    gameCounter++;

                    boolean isHome = input2.equalsIgnoreCase(homeTeam);
                    boolean isAway = input2.equalsIgnoreCase(awayTeam);

                    if ((isHome && homePoints > awayPoints) || (isAway && awayPoints > homePoints)) {
                        winCounter++;
                    } else {
                        lossCounter++;
                    }
                }
            }
            System.out.println("Games: " + gameCounter);
            System.out.println("Wins: " + winCounter);
            System.out.println("Losses " + lossCounter);

        } catch (Exception e) {
            System.out.println(input + " does not exist. Program terminated.");
        }
    }
}
