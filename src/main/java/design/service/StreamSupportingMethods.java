package design.service;

import design.Constants.Attractions;
import design.exceptions.IncorrectTaxValueException;
import design.model.Guest;

import java.util.List;
import java.util.Random;

import static design.Constants.TheftList.recogniseStolenProperty;
import static design.repository.GuestList.getGuests;

public class StreamSupportingMethods {

    TaxProvider taxProvider;

    public StreamSupportingMethods(TaxProvider taxProvider) {
        this.taxProvider = taxProvider;
    }

    public static boolean isLessThanFive(Attractions attractions) {
        return attractions.getPrice() < 5;
    }

    public static boolean isSevenOrLess(Attractions attractions) {
        return attractions.getPrice() <= 7;
    }

    public static int priceForTwo(Attractions attractions) {
        return attractions.getPrice() * 2;
    }

    public static void guestsLeaving() {
        Thread guestLeavingCountdown = new Thread(() -> {
            System.out.println("Guests start leaving...");
            List<Guest> guestList = getGuests();
            int indexOfGuests = guestList.size();

            for (int i = guestList.size(); i > 0; i--) {
                System.out.println(guestList.get(indexOfGuests - 1).getName() + " has left.");
                indexOfGuests--;
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        });

        Thread theftsOccuringCountdown = new Thread(() -> {
            List<Guest> guestList = getGuests();
            List<String> thefts = recogniseStolenProperty();
            Random randomIndex = new Random();
            int randomItemIndex = randomIndex.nextInt(thefts.size());

            for (int i = guestList.size(); i > 0; i--) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(thefts.get(randomItemIndex));

                if (randomItemIndex > 0) {
                    randomItemIndex--;
                }
            }

        });
        guestLeavingCountdown.start();
        theftsOccuringCountdown.start();

    }

    public static double priceWithDefaultTax(Attractions attraction) throws IncorrectTaxValueException {

    }

    public static double countThePriceWithIncludedTax(double initialPrice, double taxValue) throws IncorrectTaxValueException {
        if (taxValue > 0.34) {
            throw new IncorrectTaxValueException("Tax value cannot be higher than 34% of the initial price of the product.");
        }
        return initialPrice * (1 + taxValue);
    }
}
