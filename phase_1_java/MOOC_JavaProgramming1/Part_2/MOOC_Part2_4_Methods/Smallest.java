package MOOC_Part2_4_Methods;

public class Smallest {
    public static void main(String[] args) {
        int answer =  smallest(6, 1);
        System.out.println("Smallest: " + answer);
    }

    public static int smallest(int number1, int number2) {
        return Math.min(number1, number2);
    }
}
