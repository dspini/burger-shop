package model;

import java.io.Serializable;

// Must implement Serializable for our Beans when using MVC
public class Burger implements Serializable {

    // properties for bun, pickles, numPatties, Cheese
    // properties all need to be private, when implementing MVC structure to our code

    // must be able to differentiate each burger from the rest, so a unique key is needed
    private long id;

    private String burgerName;
    private int numBuns; // 3 for big mac, etc
    private int numPickles;
    private int numPatties;
    private boolean cheese; // true or false
    // TODO: Segment the condiments out into their own Bean (i.e. public class Ingredient)
    // private List<Ingredient> ingredients;

    // We have to create a 'zero-argument' constructor, so that Java can reserve space in memory for this object
    public Burger() {}

    // constructor
    public Burger(String burgerName, int numberBuns, int numberPickles, int numberPatties, boolean hasCheese) {
        // set each of the local class properties, to the arguments passed into this constructor
        this.burgerName = burgerName;
        this.numBuns = numberBuns;
        this.numPickles = numberPickles;
        numPatties = numberPatties;
        cheese = hasCheese;
    }

    /**** GETTERS AND SETTERS ******/
    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    // public Burger(int numBuns, int numPickles, int numPatties, boolean cheese) {
    //     this.numBuns = numBuns;
    //     this.numPickles = numPickles;
    //     this.numPatties = numPatties;
    //     this.cheese = cheese;
    // }

    // ctrl - enter (to get the menu where you can create getters/setters)

    public int getNumBuns() {
        return numBuns;
    }

    public void setNumBuns(int numBuns) {
        this.numBuns = numBuns;
    }

    public int getNumPickles() {
        return numPickles;
    }

    public void setNumPickles(int numPickles) {
        this.numPickles = numPickles;
    }

    public int getNumPatties() {
        return numPatties;
    }

    public void setNumPatties(int numPatties) {
        this.numPatties = numPatties;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}