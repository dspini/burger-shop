package model;

import java.io.Serializable;

// This is a Bean.  (called Soda)
public class Soda implements Serializable {
    private long id;
    private String name;
    private int quantity; // could be 1 = small, 2 = medium, 3 = large

    // zero-arg constructor
    public Soda() {}

    // constructor with everything except ID
    public Soda(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getters and Setters
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