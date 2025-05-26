package Part04_07.Decrease;

public class DecreaseCounter {
    private int value;   // a variable that remembers the value of the counter

    public DecreaseCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one
        if (value > 0) {
            this.value = value - 1;
        }
    }

    public void reset() {
        this.value = 0;
    }

    // and the other methods go here
}