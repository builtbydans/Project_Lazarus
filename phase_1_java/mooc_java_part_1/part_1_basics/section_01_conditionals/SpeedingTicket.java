package MOOC_Part1_6_Conditionals;

import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed");
        int speed = scanner.nextInt();

        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
