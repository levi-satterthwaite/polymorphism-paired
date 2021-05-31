package com.techelevator.postagecalculator;

public class PostalServiceFirstClass implements DeliveryDriver {


    @Override
    public double calculateRate(int distance, double weight) {
        double rate;
        if(weight > 0 && weight <= 2) {
            rate = (0.035 * distance);
        } else if(weight >= 3 && weight <= 8) {
            rate = (0.040 * distance);
            } else if(weight >= 9 && weight <= 15) {
            rate = (0.047 * distance);
        } else if(weight >= 16 && weight <= 48) {
            rate = (0.195 * distance);
        } else if(weight >= 64 && weight <= 128) {
            rate = (0.450 * distance);
        } else {
            rate = (0.500 * distance);
        }
        return rate;
    }
}
