package MOOC_Part3_2_Lists;

import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }
    
    public static int sum(ArrayList<Integer> arr) {
        int sum = 0;

        for (int nums: arr) {
            sum = sum + nums;
        }
        return sum;
    }
}
