package MOOC_Part3_3_Arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
    }
    public static void sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
