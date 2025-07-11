
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.printf("First %d/100\n", first);
            System.out.printf("Second %d/100\n", second);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length < 2) {
                System.out.println("Invalid input. Usage: add <amount>");
                continue;
            }

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if (command.equals("add")) {
               if (first < 100) {
                   first += amount;
               } else {
                   int toFirst = 100 - first;
                   first = 100;
                   second = Math.min(100, second + (amount - toFirst));
               }
            }
        }
    }

}
