package model;

public interface Ingredients {

    // want a method to create an ingredient and return its newly created ID
    long createIngredient(Ingredient ingredient);

    // want a method to find an ingredient by its ID
    Ingredient findById(long id);


}
