package MOOC_Part3_2_Lists;

import java.util.Objects;
import java.util.Scanner;
import java.util.ArrayList;

public class ThirdElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            nameList.add(input);

            if (Objects.equals(input, "")) {
                break;
            }
        }

        System.out.println("Third element: " + nameList.get(2));
    }
}
