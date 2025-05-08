package MOOC_Part1_4_Variables;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string: ");
        String string = scanner.nextLine();

        System.out.println("Give an integer: ");
        int int1 = scanner.nextInt();

        System.out.println("Give a double:");
        double double1 = scanner.nextDouble();

        System.out.println("Give a boolean:");
        boolean bool = scanner.nextBoolean();

        System.out.println("You gave the string: " + string);
        System.out.println("You gave the integer: " + int1);
        System.out.println("You gave the double: " + double1);
        System.out.println("You gave the boolean: " + bool);
    }
}
