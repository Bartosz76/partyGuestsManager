package design.repository;

import design.Gender;
import design.Guest;

import java.util.Arrays;
import java.util.List;

public class GuestList {

    public static List<Guest> getGuests() {
        return Arrays.asList(
                new Guest("Sara", 20, Gender.FEMALE),
                new Guest("Sara", 22, Gender.FEMALE),
                new Guest("Bob", 20, Gender.MALE),
                new Guest("Paula", 32, Gender.MALE),
                new Guest("Paul", 32, Gender.MALE),
                new Guest("Jack", 2, Gender.MALE),
                new Guest("Jack", 72, Gender.MALE),
                new Guest("Jill", 12, Gender.FEMALE)
        );
    }
}
