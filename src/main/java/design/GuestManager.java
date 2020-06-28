package design;

import design.Constants.Attractions;
import design.model.Guest;
import design.repository.AttractionsList;
import design.service.FilteringMethods;

import java.util.List;
import java.util.stream.IntStream;

import static design.repository.GuestList.*;
import static design.repository.AttractionsList.*;
import static java.util.stream.Collectors.*;
import static design.service.FilteringMethods.*;

public class GuestManager {


    public static void main(String[] args) {



        List<Guest> sortGuestsIntoNameAgeCategories = getGuests();

        System.out.println(
                sortGuestsIntoNameAgeCategories.stream()
                        .collect(toMap(
                                guest -> guest.getName() + "-" + guest.getAge(),
                                guest -> guest
                        ))
        );

        List<Guest> sortGuestsIntoNameCategories = getGuests();
        System.out.println(
                sortGuestsIntoNameCategories.stream()
                                            .collect(groupingBy(Guest::getName))
        );

        List<Guest> groupAgesOfGuestWithSameName = getGuests();
        System.out.println(
                groupAgesOfGuestWithSameName.stream()
                .collect(groupingBy(Guest::getName,
                        mapping(Guest::getAge, toList())))
        );

        List<Attractions> priceOfAllAttractionsLessThanFiveCostForTwoGuests = getAttractions();
        System.out.println(
                priceOfAllAttractionsLessThanFiveCostForTwoGuests.stream()
                .filter(FilteringMethods::isLessThanFive)
                .map(FilteringMethods::priceForTwo)
                .reduce(0, (a, b) -> a + b)
        );

        List<Attractions> allAttractionsSevenCostOrless = getAttractions();
        System.out.println(
                allAttractionsSevenCostOrless.stream()
                .filter(FilteringMethods::isSevenOrLess)
                .collect(toList())
        );

        List<Attractions> sortAttractionsByPrice = getAttractions();
        System.out.println(
                sortAttractionsByPrice.stream()
                .collect(groupingBy(Attractions::getPrice, mapping(Attractions::getName, toList())))
        );

        Thread partyCountdown = new Thread(() -> {
            System.out.println("Starting the countdown...");
            for (int i = 10; i > 0; i--){
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Counting down... " + i);
            }
            System.out.println("Party's over :<");
        });
        partyCountdown.start();






    }


}
