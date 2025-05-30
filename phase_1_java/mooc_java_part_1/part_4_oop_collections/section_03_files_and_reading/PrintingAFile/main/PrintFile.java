package Part04_03_FilesAndReadingData.PrintingAFile.main;

import java.util.Scanner;
import java.nio.file.Paths;

public class PrintFile {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(Paths.get("Phase_1_Java/MOOC_JavaProgramming1/Part_4/Part04_03_FilesAndReadingData/PrintingAFile/data.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
