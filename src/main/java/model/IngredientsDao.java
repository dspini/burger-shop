package model;

import java.util.ArrayList;
import java.util.List;

// The claaaaaawww that grabs / creates ingredients
public class IngredientsDao implements Ingredients {
    // want a storage variable to hold all the ingredients
    private List<Ingredient> ingredients = new ArrayList<>();

    // Create some ingredients to be used by default
    public IngredientsDao() {
        Ingredient pickles = new Ingredient();
        pickles.setId(1L);
        pickles.setName("Pickles (x3)");
        pickles.setQuantity(3);
        ingredients.add(pickles);

        // tomatoes (x2)
        Ingredient tomatoes = new Ingredient();
        tomatoes.setId(2L);
        tomatoes.setName("Tomatoes (x2)");
        tomatoes.setQuantity(2);
        ingredients.add(tomatoes);

        // cheese (x1)
        Ingredient cheese = new Ingredient();
        cheese.setId(3L);
        cheese.setName("Cheese (x1)");
        cheese.setQuantity(1);
        ingredients.add(cheese);

        // patty (x1)
        Ingredient singlePatty = new Ingredient();
        singlePatty.setId(4L);
        singlePatty.setName("Patty (x1)");
        singlePatty.setQuantity(1);
        ingredients.add(singlePatty);

        // bun (x2)
        Ingredient twoBuns = new Ingredient();
        twoBuns.setId(5L);
        twoBuns.setName("Buns (x2)");
        twoBuns.setQuantity(2);
        ingredients.add(twoBuns);

        // bun (x3)
        Ingredient threeBuns = new Ingredient();
        threeBuns.setId(6L);
        threeBuns.setName("Buns (x3)");
        threeBuns.setQuantity(3);
        ingredients.add(threeBuns);

        // patty (x2)
        Ingredient doublePatty = new Ingredient();
        doublePatty.setId(7L);
        doublePatty.setName("Patty (x2)");
        doublePatty.setQuantity(2);
        ingredients.add(doublePatty);

    }


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
