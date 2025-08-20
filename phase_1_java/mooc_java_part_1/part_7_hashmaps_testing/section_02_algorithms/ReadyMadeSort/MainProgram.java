import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class MainProgram {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 14, 3, 2};
        String[] words = {"Hello", "Apple", "Zebra", "West"};
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<String> words1 = new ArrayList<>();

        numbers1.add(5);
        numbers1.add(585);
        numbers1.add(342);
        numbers1.add(-44);

        words1.add("Bonjour");
        words1.add("Xin Chao");
        words1.add("Guten Tag");
        words1.add("Salam");

        System.out.println(Arrays.toString(numbers));
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();
        System.out.println(Arrays.toString(words));
        sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println();

        System.out.println(numbers1);
        sortIntegers(numbers1);
        System.out.println(numbers1);

        System.out.println();

        System.out.println(words1);
        sortStrings(words1);
        System.out.println(words1);
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
