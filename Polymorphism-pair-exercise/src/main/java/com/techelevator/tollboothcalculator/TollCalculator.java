package com.techelevator.tollboothcalculator;

import java.util.ArrayList;
import java.util.List;

public class TollCalculator {

    public static void main(String[] args) {

        List<Vehicle> vehiclesThroughToll = new ArrayList<Vehicle>();
        vehiclesThroughToll.add(new Car(false));
        vehiclesThroughToll.add(new Car(true));
        vehiclesThroughToll.add(new Tank());
        vehiclesThroughToll.add(new Truck(4));
        vehiclesThroughToll.add(new Truck(6));
        vehiclesThroughToll.add(new Truck(8));


        System.out.printf("%-25s %-30s %-15s %n", "Vehicle", "Distance Traveled", "Toll $" );
        System.out.println("---------------------------------------------------------------");

        int totalMilesTraveled = 0;
        double totalTollboothRevenue = 0;

    for (Vehicle vehicles: vehiclesThroughToll){
        int randomDistance = (int) (Math.random() * (240 - 10) + 10);
        System.out.printf("%-25s %-30d %-1s %-1s %n", vehicles.toString(), randomDistance, "$", String.format("%.2f", vehicles.calculateToll(randomDistance) ));
        totalMilesTraveled = totalMilesTraveled + randomDistance;
        totalTollboothRevenue = totalTollboothRevenue + vehicles.calculateToll(randomDistance);
    }

        System.out.println("");
        System.out.println("Total Miles Traveled: " + totalMilesTraveled);
        System.out.println("Total Tollbooth Revenue: $ " + String.format("%.2f", totalTollboothRevenue));

    }

}

