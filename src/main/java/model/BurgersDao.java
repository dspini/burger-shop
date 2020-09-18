package model;

import java.util.ArrayList;
import java.util.List;

// This class will implement the `Burgers` interface
//  therefore, it must have all the methods defined in `Burgers`
public class BurgersDao implements Burgers {

    // Create a temporary list, to hold the burgers as they are created
    private List<Burger> burgers = new ArrayList<>();

    public BurgersDao() {
        // Create some burgers that contain those ingredients

        // BigMac = Patty x2, Buns x3, cheese (x1), pickles (x3)
        // Add all of the ingredients to a list
        List<Ingredient> bigMacIngredients = new ArrayList<>();
        bigMacIngredients.add(DaoFactory.getIngredientsDao().findById(7L)); // double patty
        bigMacIngredients.add(DaoFactory.getIngredientsDao().findById(6L)); // buns x3
        bigMacIngredients.add(DaoFactory.getIngredientsDao().findById(3L)); // cheese x1
        bigMacIngredients.add(DaoFactory.getIngredientsDao().findById(1L)); // pickles x3
        Burger bigMac = new Burger("Big Mac", bigMacIngredients);
        bigMac.setId(1L);
        // add it to the local array list of burgers
        burgers.add(bigMac);

        // Homestyle = Patty x1, Buns x2, pickles (x3), tomatoes (x2)
        List<Ingredient> homestyleIngredients = new ArrayList<>();
        homestyleIngredients.add(DaoFactory.getIngredientsDao().findById(4L)); //patty x1
        homestyleIngredients.add(DaoFactory.getIngredientsDao().findById(5L)); //buns x2
        homestyleIngredients.add(DaoFactory.getIngredientsDao().findById(1L)); //pickles
        homestyleIngredients.add(DaoFactory.getIngredientsDao().findById(2L)); //tomatoes
        Burger homestyle = new Burger("Homestyle", homestyleIngredients);
        homestyle.setId(2L);
        // add it to our local arraylist of burgers
        burgers.add(homestyle);

        // Quarter Pounder = Buns x2, Patty x1, Pickles (x3), Cheese (x1)
        List<Ingredient> qpIngredients = new ArrayList<>();
        qpIngredients.add(DaoFactory.getIngredientsDao().findById(5L)); // buns x2
        qpIngredients.add(DaoFactory.getIngredientsDao().findById(4L)); // single patty
        qpIngredients.add(DaoFactory.getIngredientsDao().findById(1L)); // pickles
        qpIngredients.add(DaoFactory.getIngredientsDao().findById(3L)); // cheese
        Burger quarterPounder = new Burger("Quarter Pounder", qpIngredients);
        quarterPounder.setId(3L);
        // and of course.... add it to our local array list of burgers
        burgers.add(quarterPounder);

    }


    // if we had a MySQL connection _instead_ of an ArrayList, the create and find methods would still do the exact same thing and return the exact same data types
    // And everywhere except this exact file has no idea what storage medium we are using



    // this method will search for a Burger by its ID, and return the full Burger object
    @Override
    public Burger findById(long id) {

        // we want to find the burger with the ID that's passed in as an argument to this method
        // QUESTION: Are ArrayLists 1-indexed or 0-indexed?
        // ANSWER: 0-indexed
        // So to get the burger with an ID of 1, we need to get the element at index 0 of our `burgers` ArrayList

        // ArrayList.get(index) expects `index` to be an int, so we have to type-caste id from a long to an int
        return burgers.get((int)id - 1);
    }

    // this method will create a Burger object in our local repository of burgers, and return the newly added burger's ID
    @Override
    public long createBurger(Burger burger) {
        // the ID for each burger should be 1-indexed
        //  to get the ID of a newly created burger, we'll get the size of the current `burgers` list, and add 1 to it
        burger.setId(burgers.size() + 1);

        // We need to add the passed in `Burger` object (burger) to our ArrayList
        burgers.add(burger);

        // return the newly added burger's ID as a long value
        return burger.getId();
    }
}