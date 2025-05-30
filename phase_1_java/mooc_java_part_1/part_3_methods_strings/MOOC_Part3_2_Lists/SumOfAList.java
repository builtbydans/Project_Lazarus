package MOOC_Part3_2_Lists;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();

            if (input == -1) {
                break;
            }

            numList.add(input);
        }

        int biggest = numList.get(0);

        for (int nums : numList) {
            if (biggest < nums) {
                biggest = nums;
            }
        }

        System.out.println("Greatest in list: " + biggest);
    }
}
