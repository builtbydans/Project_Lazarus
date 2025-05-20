package MOOC_Part2_3_MoreLoops;

import java.util.Scanner;

public class RepeatingRemember {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double avg = 0;
        int odd = 0;
        int even = 0;

        System.out.println("Give numbers:");

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            count++;
            sum += input;
        }

        avg = (double) sum / count;

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Odd: " + odd);
        System.out.println("Even: " + even);
    }
}
