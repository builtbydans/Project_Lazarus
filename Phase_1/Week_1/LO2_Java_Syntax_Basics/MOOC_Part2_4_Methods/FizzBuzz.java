package MOOC_Part2_4_Methods;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(1, 100);
    }

    public static void fizzBuzz(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
