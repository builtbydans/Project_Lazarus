package MOOC_Part1_6_Conditionals;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even");
        } else {
            System.out.println("Number " + num + " is odd") ;
        }
    }
}
