package design.service;

import design.Constants.Attractions;

public class FilteringMethods {

    public static boolean isLessThanFive(Attractions attractions) {
        return attractions.getPrice() < 5;

    }

    public static int priceForTwo(Attractions attractions){
        return attractions.getPrice() * 2;
    }

}
