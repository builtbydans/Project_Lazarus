package Part04_03_FilesAndReadingData;

import java.util.Scanner;

public class NumOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }
            counter++;
         }

        System.out.println(counter);
    }
}
