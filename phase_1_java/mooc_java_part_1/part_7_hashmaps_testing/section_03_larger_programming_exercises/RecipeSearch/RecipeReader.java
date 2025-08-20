import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RecipeReader {

    public List<Recipe> readRecipes(String fileName) {
        List<Recipe> recipes = new ArrayList<>();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("This file does not exist!");
            return recipes;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            // Outer loop: keep reading blocks until file ends
            while ((line = reader.readLine()) != null) {
                String name = line; // First line is name

                int cookTime = Integer.parseInt(reader.readLine()); // Second line is cook time

                List<String> ingredients = new ArrayList<>();

                // Read all ingredient lines until blank line or end of file
                while ((line = reader.readLine()) != null && !line.isEmpty()) {
                    ingredients.add(line);
                }

                // Construct recipe and add to list
                recipes.add(new Recipe(name, cookTime, ingredients));
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }

        return recipes;
    }
}
