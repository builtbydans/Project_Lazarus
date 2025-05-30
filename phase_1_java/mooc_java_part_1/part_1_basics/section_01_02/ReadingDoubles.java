package MOOC_Part1_4_Variables;

import java.util.Scanner;

public class ReadingDoubles {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        double num = Double.valueOf(scanner.nextLine());

        System.out.println("You wrote: " + num);
    }

}
