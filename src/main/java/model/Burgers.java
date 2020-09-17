package model;
// this is the DAO Interface

// this interface will define all the methods we need to access the data from our Bean
// This is the interface the DAO will implement
public interface Burgers {

    // We need a method to go find a burger by its ID
    //  we want the return object to be type `Burger`
    Burger findById(long id);

    // We need a method to create a new burger, and return the ID (long) once it is successfully created
    long createBurger(Burger burger);
}
