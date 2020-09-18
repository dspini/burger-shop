package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDao implements Sodas {

    // This will hold all of our Soda objects, while our app is running
    List<Soda> sodas = new ArrayList<>();

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