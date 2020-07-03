package design.service;

import design.Constants.Attractions;
import design.model.Guest;

import java.util.List;

import static design.repository.GuestList.getGuests;

import static design.repository.AttractionsList.getAttractions;
import static design.repository.GuestList.getGuests;
import static java.util.stream.Collectors.*;
import static design.Constants.TextColors.*;

public class StreamMethods {

    public static void setSortGuestsIntoNameAgeCategories() {
        List<Guest> sortGuestsIntoNameAgeCategories = getGuests();

        System.out.println(
                sortGuestsIntoNameAgeCategories.stream()
                        .collect(toMap(
                                guest -> guest.getName() + "-" + guest.getAge(),
                                guest -> guest
                        )) + ANSI_BLUE
        );
    }

    public static void sortGuestIntoNameCategories() {
        List<Guest> sortGuestsIntoNameCategories = getGuests();
        System.out.println(
                sortGuestsIntoNameCategories.stream()
                        .collect(groupingBy(Guest::getName)) + ANSI_PURPLE
        );

    }

    public static void groupAgesofGuestsWithSameName() {
        List<Guest> groupAgesOfGuestWithSameName = getGuests();
        System.out.println(
                groupAgesOfGuestWithSameName.stream()
                        .collect(groupingBy(Guest::getName,
                                mapping(Guest::getAge, toList()))) + ANSI_GREEN
        );
    }

    public static void priceOfAllAttractionsLessThanFiveCostForTwoGuests() {
        List<Attractions> priceOfAllAttractionsLessThanFiveCostForTwoGuests = getAttractions();
        System.out.println(
                priceOfAllAttractionsLessThanFiveCostForTwoGuests.stream()
                        .filter(StreamSupportingMethods::isLessThanFive)
                        .map(StreamSupportingMethods::priceForTwo)
                        .reduce(0, (a, b) -> a + b) + ANSI_RED
        );
    }

    public static void allAttractionsSevenCostOrLess(){
        List<Attractions> allAttractionsSevenCostOrLess = getAttractions();
        System.out.println(
                allAttractionsSevenCostOrLess.stream()
                        .filter(StreamSupportingMethods::isSevenOrLess)
                        .collect(toList())
        );
    }

    public static void sortAttractionsByPrice(){
        List<Attractions> sortAttractionsByPrice = getAttractions();
        System.out.println(
                sortAttractionsByPrice.stream()
                        .collect(groupingBy(Attractions::getPrice, mapping(Attractions::getName, toList())))
        );
    }

    /*
    * BELOW ARE ABOVE METHODS MODIFIED FOR TESTING PURPOSES
    */

    public static void allAttractionsSevenCostOrLessRequiringParameter(List<Attractions> listParameter){
        System.out.println(
                listParameter.stream()
                        .filter(StreamSupportingMethods::isSevenOrLess)
                        .collect(toList())
        );
    }



}
