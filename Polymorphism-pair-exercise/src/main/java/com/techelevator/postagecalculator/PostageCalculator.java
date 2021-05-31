package com.techelevator.postagecalculator;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PostageCalculator {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);


        // Ask for weight of package
        System.out.print("Please enter the weight of the package: ");
        double weightOfPackage = input.nextDouble();
        input.nextLine();

        // pounds or ounces
        System.out.print("(P)ounds or (O)unces? ");
        String poundsOrOunces = input.nextLine();

        // what distance will you be traveling
        System.out.print("What distance will it be traveling? ");
        int distanceTraveled = input.nextInt();
        input.nextLine();

        List<DeliveryDriver> deliveryMethodOunces = new ArrayList<DeliveryDriver>();
        deliveryMethodOunces.add(new PostalServiceFirstClass());
        deliveryMethodOunces.add(new PostalServiceSecondClass());
        deliveryMethodOunces.add(new PostalServiceThirdClass());
        deliveryMethodOunces.add(new FexEd());

        List<DeliveryDriver> deliveryMethodPounds = new ArrayList<DeliveryDriver>();
        deliveryMethodPounds.add(new SPUGround());
        deliveryMethodPounds.add(new SPUBusiness());
        deliveryMethodPounds.add(new SPUNextDay());


        System.out.println("");
        System.out.printf("%-35s %-30s %n", "Delivery Method", "$ cost" );
        System.out.println("-------------------------------------------");

        for (DeliveryDriver methods: deliveryMethodOunces){
            double convertedWeight;
            if (poundsOrOunces.equals("P")){
                convertedWeight = weightOfPackage * 16;
            }
            else {
                convertedWeight = weightOfPackage;
            }
            System.out.printf("%-35s %-1s %-1s %n", methods.toString(), "$", String.format("%.2f", methods.calculateRate(distanceTraveled, convertedWeight)));
        }

        for (DeliveryDriver methods: deliveryMethodPounds){
            double convertedWeight;
            if (poundsOrOunces.equals("O")){
                convertedWeight = weightOfPackage * 0.0625;
            }
            else {
                convertedWeight = weightOfPackage;
            }
            System.out.printf("%-35s %-1s %-1s %n", methods.toString(), "$", String.format("%.2f",  methods.calculateRate(distanceTraveled, convertedWeight)));
        }



    }
}
