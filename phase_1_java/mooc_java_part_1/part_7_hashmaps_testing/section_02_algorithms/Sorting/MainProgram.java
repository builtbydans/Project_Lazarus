import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        int[] numbers = {-1, 6, 9, 8, 12};
        int[] numbers2 = {3, 2, 5, 4, 8};
        int[] numbers3 = {8, 3, 7, 9, 1, 2, 4};
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers, 2));
        System.out.println(Arrays.toString(indexWithInt(numbers, 0)));

        System.out.println("Original: " + Arrays.toString(numbers2));

        MainProgram.swap(numbers2, 1, 0);
        System.out.println("First Swap: " + Arrays.toString(numbers2));

        MainProgram.swap(numbers2   , 0, 3);
        System.out.println("Second Swap: " + Arrays.toString(numbers2));

        System.out.println();

        System.out.println("Original: " + Arrays.toString(numbers3));
        MainProgram.sort(numbers3);
        System.out.println("Sorted: " + Arrays.toString(numbers3));
    }

    public static int smallest(int[] array) {
        int check = array[0];

        for (int j : array) {
            if (j < check) {
                check = j;
            }
        }
        return check;
    }

    public static int indexOfSmallest(int[] array) {
        if (array.length == 0)
            return -1;

        int index = 0;
        int min = array[index];

        for (int i = 0; i < array.length; i++){
            if (array[i] <= min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        if (table.length == 0)
            return -1;

        int index = startIndex;
        int min = table[startIndex];

        for (int i = startIndex; i < table.length; i++){
            if (table[i] <= min){
                min = table[i];
                index = i;
            }
        }
        return index;
    }

    // extra challenge
    public static int[] indexWithInt(int[] table, int startIndex) {
        if (table.length == 0)
            return null;

        int index = startIndex;
        int min = table[startIndex];

        for (int i = startIndex; i < table.length; i++){
            if (table[i] <= min){
                min = table[i];
                index = i;
            }
        }
        return new int[] { index, min };
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
}
