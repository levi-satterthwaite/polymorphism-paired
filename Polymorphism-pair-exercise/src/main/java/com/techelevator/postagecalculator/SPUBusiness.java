package com.techelevator.postagecalculator;

public class SPUBusiness implements DeliveryDriver {

    @Override
    public double calculateRate(int distance, double weight) {
        double rate;
        rate = (weight * 0.050) * distance;
        return rate;
    }

    @Override
    public String toString(){
        return "SPU (2-Day Business)";
    }
}
