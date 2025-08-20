import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String name;
    private int cookTime;
    private List<String> ingredients;

    public Recipe(String name, int cookTime, List<String> ingredients) {
        this.name = name;
        this.cookTime = cookTime;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getCookTime() {
        return cookTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    // Optional: display method
    public String toString() {
        return name + ", cooking time: " + cookTime;
    }
}
