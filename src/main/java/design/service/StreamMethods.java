package design.service;

import design.Constants.Attractions;
import design.model.Guest;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

import static design.repository.GuestList.getGuests;

import static design.repository.AttractionsList.getAttractions;
import static design.repository.GuestList.getGuests;
import static java.util.stream.Collectors.*;
import static design.Constants.TextColors.*;

public class StreamMethods {

    public static void setSortGuestsIntoNameAgeCategories() {
        System.out.println(
                getGuests().stream()
                        .collect(toMap(
                                guest -> guest.getName() + "-" + guest.getAge(),
                                guest -> guest
                        )) + ANSI_BLUE
        );
    }

    public static void sortGuestIntoNameCategories() {
        System.out.println(
                getGuests().stream()
                        .collect(groupingBy(Guest::getName)) + ANSI_PURPLE
        );

    }

    public static void groupAgesofGuestsWithSameName() {
        System.out.println(
                getGuests().stream()
                        .collect(groupingBy(Guest::getName,
                                mapping(Guest::getAge, toList()))) + ANSI_GREEN
        );
    }

    public static void priceOfAllAttractionsLessThanFiveCostForTwoGuests() {
        System.out.println(
                getAttractions().stream()
                        .filter(StreamSupportingMethods::isLessThanFive)
                        .map(StreamSupportingMethods::priceForTwo)
                        .reduce(0, (a, b) -> a + b) + ANSI_RED
        );
    }

    public static void allAttractionsSevenCostOrLess() {
        System.out.println(
                getAttractions().stream()
                        .filter(StreamSupportingMethods::isSevenOrLess)
                        .collect(toList())
        );
    }

    public static void sortAttractionsByPrice() {
        System.out.println(
                getAttractions().stream()
                        .collect(groupingBy(Attractions::getPrice, mapping(Attractions::getName, toList())))
        );
    }


    public static void allAttractionsSevenCostOrLessRequiringParameter(List<Attractions> listParameter) {
        System.out.println(
                listParameter.stream()
                        .filter(StreamSupportingMethods::isSevenOrLess)
                        .collect(toList())
        );
    }

    public static Optional<String> findingANameIfPresent(String name) {
        Optional<String> findTheName = getAttractions().stream()
                .filter(e -> e.getName().equals(name))
                .map(Attractions::getName)
                .findFirst();

        return findTheName;
    }


}
