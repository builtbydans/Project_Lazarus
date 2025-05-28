package Part04_01_IntroToOOP.Gauge;

public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return value == 5;
    }
}
