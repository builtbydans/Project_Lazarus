package MOOC_Part1_5_CalcNums;

import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {

        int secondsInDay = 86400;
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println(num * secondsInDay);
    }
}
