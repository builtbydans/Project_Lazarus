package MOOC_Part1_6_Conditionals;

import java.util.Scanner;

public class LargerThanOrEqualTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number");
        int num1 = scanner.nextInt();

        System.out.println("Give a second number");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Greater number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Greater number is: " + num2);
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
