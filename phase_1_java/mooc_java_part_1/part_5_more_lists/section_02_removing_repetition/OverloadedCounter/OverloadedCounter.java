
public class OverloadedCounter {

    public static void main(String[] args) {
        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter();

        counter1.increase();
        System.out.println("Counter 1: " + counter1);
        counter1.decrease();
        System.out.println("Counter 1: " + counter1);
        counter1.increase(10);
        System.out.println("Counter 1: " + counter1);
        counter1.decrease(50);
        System.out.println("Counter 1: " + counter1);

        System.out.println("Counter 2: " + counter2);
        counter2.increase(100);
        System.out.println("Counter 2: " + counter2);
    }
}
