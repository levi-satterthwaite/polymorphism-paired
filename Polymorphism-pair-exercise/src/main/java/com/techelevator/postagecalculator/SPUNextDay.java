package com.techelevator.postagecalculator;

public class SPUNextDay implements DeliveryDriver {


    @Override
    public double calculateRate(int distance, double weight) {
        double rate;
        rate = (weight * 0.075) * distance;
        return rate;
    }

    @Override
    public String toString(){
        return "SPU (Next Day)";
    }
}
