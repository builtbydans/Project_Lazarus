package MOOC_Part3_2_Lists;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class SecondPlusThird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            numList.add(input);

            if (input == 0) {
                break;
            }
        }

        int result = numList.get(1) + numList.get(2);
        System.out.println("Second Plus Third: " + result);
    }
}
