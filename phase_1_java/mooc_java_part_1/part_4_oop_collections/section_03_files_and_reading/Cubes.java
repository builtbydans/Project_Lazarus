package Part04_03_FilesAndReadingData;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("end")) {
                break;
            }

            int num = Integer.parseInt(input);
            System.out.println(num * num * num);
         }
    }
}
