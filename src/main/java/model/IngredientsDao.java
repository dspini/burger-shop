package model;

import java.util.ArrayList;
import java.util.List;

// The claaaaaawww that grabs / creates ingredients
public class IngredientsDao implements Ingredients {
    // want a storage variable to hold all the ingredients
    private List<Ingredient> ingredients = new ArrayList<>();

    // write the method to find an ingredient by its ID
    @Override
    public Ingredient findById(long id) {
        return ingredients.get((int)id - 1);
    }

    // want a method to create an ingredient and return its newly created ID
    @Override
    public long createIngredient(Ingredient ingredient) {
        ingredient.setId(ingredients.size() + 1);

        ingredients.add(ingredient);

        return ingredient.getId();
    }

}