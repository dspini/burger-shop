package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDao implements Sodas {

    // This will hold all of our Soda objects, while our app is running
    List<Soda> sodas = new ArrayList<>();

    public SodasDao() {
        Soda coke = new Soda("Coca-Cola", 1);
        coke.setId(1L);
        // add it to our our local array list of sodas
        sodas.add(coke);

        Soda drPepper = new Soda("Dr Pepper", 2);
        drPepper.setId(2L);
        // add it to our our local array list of sodas
        sodas.add(drPepper);

        Soda sprite = new Soda("Sprite", 3);
        sprite.setId(3L);
        // add it to our our local array list of sodas
        sodas.add(sprite);
    }

    @Override
    public long createSoda(Soda soda) {
        soda.setId(sodas.size() + 1);

        sodas.add(soda);

        return soda.getId();
    }

    @Override
    public Soda findById(long id) {
        return sodas.get((int)id - 1);
    }
}
