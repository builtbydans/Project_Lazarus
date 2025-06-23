import java.util.ArrayList;

public class Suitcase {
    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        int sum = 0;
        for (Item item : items) {
            sum += item.getWeight();
        }
        return sum;
    }

    public void printItems() {
       for (Item item : items) {
           System.out.println(item.toString());
       }
    }

    public Item heaviestItem() {

        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.getFirst();

        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    @Override
    public String toString() {
        int count = this.items.size();
        int weight = this.totalWeight();

        if (count == 0) {
            return String.format("no items (%d kg)", weight);
        } else if (count == 1) {
            return String.format("1 item (%d kg)", weight);
        } else {
            return String.format("%d items (%d kg)", count, weight);
        }
    }
}
