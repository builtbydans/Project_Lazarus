package MOOC_Part2_4_Methods;

public class DivisibleBy3 {
    public static void main(String[] args) {
        division(2,10);
    }

    public static void division(int num1, int num2) {
        for (int i = num1; i <= num2; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
