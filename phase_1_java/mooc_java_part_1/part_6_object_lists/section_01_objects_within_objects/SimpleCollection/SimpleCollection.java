
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        String longest = elements.getFirst();

        for (String element : elements) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }
        return longest;
    }

    @Override
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        StringBuilder result = new StringBuilder("The collection " + this.name + " has " + elements.size() +
                (elements.size() == 1 ? " element:" : " elements:"));

        for (String element : elements) {
            result.append("\n").append(element);
        }

        return result.toString();
    }


}
