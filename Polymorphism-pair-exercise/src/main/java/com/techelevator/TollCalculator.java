package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {
    public static void main(String[] args) {


        int randomDistance = (int) (Math.random() * (240 - 10) + 10);

        List<Vehicle> vehiclesThroughToll = new ArrayList<Vehicle>();
        vehiclesThroughToll.add(new Car(false));
        vehiclesThroughToll.add(new Car(true));
        vehiclesThroughToll.add(new Tank());
        vehiclesThroughToll.add(new Truck(4));
        vehiclesThroughToll.add(new Truck(6));
        vehiclesThroughToll.add(new Truck(8));


        System.out.println("Vehicle       Distance Traveled       Toll $" );
        System.out.println("----------------------------------------------");


    for (Vehicle vehicles: vehiclesThroughToll){
        int rand = randomDistance;
        System.out.println(vehicles.toString() + rand +"$" + vehicles.calculateToll(rand) );
    }



    }

}

