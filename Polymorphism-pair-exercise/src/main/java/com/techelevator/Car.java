package com.techelevator;

public class Car implements Vehicle {

    // attributes
    private boolean hasTrailer;

    // getters


    public boolean isHasTrailer() {
        return hasTrailer;
    }

    // constructor
    public Car(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    // method

    @Override
    public double calculateToll(int distance) {
        double tollTotal;
        if (hasTrailer == true) {
          tollTotal = (distance * .02) + 1;
        } else {
            tollTotal = (distance * .02);
        }
        return tollTotal;
    }
}
