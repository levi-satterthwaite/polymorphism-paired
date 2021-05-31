package com.techelevator.postagecalculator;

public class SPUGround implements DeliveryDriver {


    @Override
    public double calculateRate(int distance, double weight) {
        double rate;
        rate = (weight * 0.0050) * distance;
        return rate;
    }

    @Override
    public String toString(){
        return "SPU (4-Day Ground)";
    }
}
