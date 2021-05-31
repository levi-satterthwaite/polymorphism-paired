package com.techelevator.postagecalculator;

public class FexEd implements DeliveryDriver{


    @Override
    public double calculateRate(int distance, double weight) {
        double rate = 20;
        if(distance > 500) {
            rate = rate + 5;
        }
        if(weight > 48) {
            rate = rate + 3;
        }
        return rate;
    }

    @Override
    public String toString(){
        return "FexEd";
    }
}
