package com.techelevator.tollboothcalculator;

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

    @Override
    public String toString(){
        if (hasTrailer == true){
            return "Car (with trailer)";
        } else {
            return "Car";
        }
    }
}
