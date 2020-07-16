package design;

import java.util.Optional;
import java.util.Scanner;

import static design.Constants.TextColors.*;
import static design.service.StreamMethods.*;
import static design.service.StreamSupportingMethods.guestsLeaving;

public class GuestManager {


    public static void main(String[] args) {

        boolean appIsRunning = true;
        while (appIsRunning) {
            System.out.println("Welcome to Console Party Manager!");
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("See your management options below and select the appropriate one:");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1. Sort guests into name and age categories.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2. Sort guests into name categories.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("3. Group all ages of guests with the same name.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("4. Count the price of all attractions for less than 5 for two guests.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("5. Show all attractions that cost 7 or less.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("6. Sort attractions by price.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("7. Provide the name of the attraction to see if available.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("8. Finish the party.");

            Scanner scanner = new Scanner(System.in);
            int chosenOptionNumber = scanner.nextInt();

            if (chosenOptionNumber == 1) {
                setSortGuestsIntoNameAgeCategories();
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thank you! Please, choose the next action." + ANSI_GREEN);
            }

            if (chosenOptionNumber == 2) {
                sortGuestIntoNameCategories();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thank you! Please, choose the next action." + ANSI_CYAN);
            }

            if (chosenOptionNumber == 3) {
                groupAgesofGuestsWithSameName();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thank you! Please, choose the next action." + ANSI_BLUE);
            }

            if (chosenOptionNumber == 4) {
                priceOfAllAttractionsLessThanFiveCostForTwoGuests();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thank you! Please, choose the next action." + ANSI_PURPLE);
            }

            if (chosenOptionNumber == 5) {
                allAttractionsSevenCostOrLess();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thank you! Please, choose the next action." + ANSI_RED);
            }

            if (chosenOptionNumber == 6) {
                sortAttractionsByPrice();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thank you! Please, choose the next action." + ANSI_CYAN);

            }

            if (chosenOptionNumber == 7) {
                System.out.println("Please, provide the name of attraction:");
                String providedName = scanner.next();
                scanner.nextLine();
                Optional<String> result = findingANameIfPresent(providedName);
                result.ifPresentOrElse(
                        s -> System.out.println("The attraction is available."),
                        () -> System.out.println("Attracion not present."));
                System.out.println("Thank you! Please, choose the next action." + ANSI_BLUE);
            }

            if (chosenOptionNumber == 8) {
                guestsLeaving();
                appIsRunning = false;
            }
        }


    }


}
