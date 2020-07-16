package design.service;


import design.Constants.Attractions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static design.service.StreamSupportingMethods.*;
import static design.service.StreamMethods.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    @Test
    void shouldBeLessThanFive(){
        assertThat(isLessThanFive(Attractions.MINI_GOLF)).isEqualTo(true);
    }

    @Test
    void shouldBeSevenOrLess(){
        assertThat(isSevenOrLess(Attractions.MINI_GOLF)).isNotEqualTo(false);
    }

    @Test
    void shouldReturnAProvidedName(){
        assertEquals(Optional.of("MediumDrink"), findingANameIfPresent("MediumDrink"));
    }

    @Test
    void shouldReturnEmptyOptional(){
        assertThat(findingANameIfPresent("OrangeJuice").equals(Optional.empty()));
    }




}
