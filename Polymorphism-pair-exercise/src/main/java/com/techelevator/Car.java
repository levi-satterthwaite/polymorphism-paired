package com.techelevator;

public class Car implements Vehicle {

    // attributes
    private boolean hasTrailer;


    // constructor
    public Car(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    // method

    @Override
    public double calculateToll(int distance) {
        
        return 0;
    }
}
