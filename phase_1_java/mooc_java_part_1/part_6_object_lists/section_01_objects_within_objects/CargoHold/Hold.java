import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Suitcase suitcase : suitcases) {
            sum += suitcase.totalWeight();
        }
        return sum;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    public String toString() {
        return String.format("%d suitcases (%d kg)", this.suitcases.size(), totalWeight());
    }
}
