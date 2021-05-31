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
        double distanceTraveled = input.nextDouble();
        input.nextLine();

        List<DeliveryDriver> deliveryMethod = new ArrayList<DeliveryDriver>();
        deliveryMethod.add(new PostalServiceFirstClass());
        deliveryMethod.add(new PostalServiceSecondClass());
        deliveryMethod.add(new PostalServiceThirdClass());
        deliveryMethod.add(new FexEd());
        deliveryMethod.add(new SPUGround());
        deliveryMethod.add(new SPUBusiness());
        deliveryMethod.add(new SPUNextDay());




    }
}
