package MOOC_Part2_4_Methods;

public class AdvancedAstrology {
    public static void main(String[] args) {
        printChristmasTree(4);
        printChristmasTree(10);
    }

    public static void printSpaces(int number) {
        System.out.print(" ".repeat(number));
    }

    public static void printStars(int number) {
        System.out.print("*".repeat(number));
        System.out.println();
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void printChristmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
        }

        // Trunk: always 3 stars, centered
        for (int j = 0; j < 2; j++) {
            printSpaces(height - 2); // center the trunk
            printStars(3);
        }
    }
}
