package com.techelevator;

public class Truck implements Vehicle {

    // attributes
    private int numberOfAxels;

    // getter

    public int getNumberOfAxles() {
        return numberOfAxels;
    }

    // constructor
    public Truck(int numberOfAxles) {
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
    public String toString() {
        if (numberOfAxels <= 4) {
            return "truck (4 axels)";
        } else if (numberOfAxels <= 6) {
            return "truck (6 axels)";
       } else (numberOfAxels <= 8) {
          return "truck (8 axels)";
        }
        }
    }
