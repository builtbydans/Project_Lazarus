package MOOC_Part2_4_Methods;

public class PrintStars {
    public static void main(String[] args) {
        printSquare(4);
        printRectangle(17, 3);
        printTriangle(4);
    }

    public static void printStars(int number) {
        System.out.print("*".repeat(number));
        System.out.println();
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }
    }
}
