package model;

import java.util.ArrayList;
import java.util.List;

// The claaaaaawww that grabs / creates ingredients
public class SodasDao implements Sodas {
    // want a storage variable to hold all the ingredients
    private List<Ingredient> sodas = new ArrayList<>();

    // write the method to find an ingredient by its ID
    @Override
    public Sodas findById(long id) {
        return sodas.get((int)id - 1);
    }

    // want a method to create an ingredient and return its newly created ID
    @Override
    public long createSodas(Sodas sodas) {
        sodas.setId(sodas.size() + 1);

        sodas.add(sodas);

        return soda.getId();
    }

}