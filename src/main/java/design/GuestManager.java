package design;

import java.util.List;

import static design.repository.GuestList.*;

import static java.util.stream.Collectors.toMap;

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




    }


}
