package MOOC_Part3_3_Arrays;

public class PrintNeatly {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        printNeatly(numbers);
    }
    public static void printNeatly(int[] array) {
        StringBuilder sb = new StringBuilder(   );
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                sb.append(array[i]).append(",");
            } else {
                sb.append(array[i]);
            }
        }
        System.out.println(sb);
    }
}
