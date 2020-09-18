package model;

public interface Sodas {
    // create soda and return its ID
    public long createSoda(Soda soda);

    // find a soda by its ID
    public Soda findById(long id);
}