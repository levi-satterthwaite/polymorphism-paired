package com.techelevator;

public class Truck implements Vehicle{

    // attributes
    private int numberOfAxles;

    // getter

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    // constructor
    public Truck(int numberOfAxles){
        this.numberOfAxles = numberOfAxles;
    }

    // method

    @Override
    public double calculateToll(int distance) {
        double tollTotal;
        if (numberOfAxles < 6) {
            tollTotal = (.04 * distance);
        } else if (numberOfAxles < 8) {
            tollTotal = (.045 * distance);
        } else {
            tollTotal = (.048 * distance);
        }
    return tollTotal;
    }
}
