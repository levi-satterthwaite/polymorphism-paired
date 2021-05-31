package com.techelevator.postagecalculator;

public class SPUGround implements DeliveryDriver {


    @Override
    public double calculateRate(int distance, double weight) {
        double rate;
        rate = (weight * 0.0050) * distance;
        return rate;
    }
}
