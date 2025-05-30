package MOOC_Part2_4_Methods;

public class FromOneToParam {
    public static void main(String[] args) {
        printUpUntilNum(6);
        printDownUntilNum(5);
    }

    public static void printUpUntilNum(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static void printDownUntilNum(int num) {
        for (int i = num; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
