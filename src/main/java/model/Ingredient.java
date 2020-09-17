package model;

import java.io.Serializable;

// we want this class to represent a burger ingredient
public class Ingredient implements Serializable {

    //  Create all properties, with correct access type (public/protected/private)

    // 1. long id
    private long id;
    // 2. string name
    private String name;
    // 3. int quantity
    private int quantity;


    // Create a zero-argument constructor
    public Ingredient() {}

    // Create a constructor with all properties except the ID
    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Create all getters & setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}