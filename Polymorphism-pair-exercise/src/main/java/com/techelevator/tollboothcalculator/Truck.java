package com.techelevator.tollboothcalculator;

public class Truck implements Vehicle {

    // attributes
    private int numberOfAxels;

    // getter

    public int getNumberOfAxels() {

        return numberOfAxels;
    }

    // constructor
    public Truck(int numberOfAxels) {

        this.numberOfAxels = numberOfAxels;
    }

    // method

    @Override
    public double calculateToll(int distance) {
        double tollTotal;
        if (numberOfAxels < 6) {
            tollTotal = (.04 * distance);
        } else if (numberOfAxels < 8) {
            tollTotal = (.045 * distance);
        } else {
            tollTotal = (.048 * distance);
        }
        return tollTotal;
    }

    @Override
    public String toString(){
        if (numberOfAxels <= 4) {
            return "Truck (4 axels)";
        } else if (numberOfAxels <= 6) {
            return "truck (6 axels)";
       } else if (numberOfAxels >= 8) {
          return "truck (8 axels)";
        }
        return "";
    }
}
