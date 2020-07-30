package design.service;


import design.Constants.Attractions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static design.service.StreamSupportingMethods.*;
import static design.service.StreamMethods.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Tests {

    TaxProvider taxProvider;
    StreamMethods streamMethods;
    StreamSupportingMethods streamSupportingMethods;

    @Test
    @DisplayName("Should return the price of the attraction after the default tax was applied.")
    void shouldReturnAttractionPriceAfterDefaultTaxation(){

    }

    @Test
    @DisplayName("Provided product should have the price lower than 5.")
    void shouldBeLessThanFive() {
        assertThat(isLessThanFive(Attractions.MINI_GOLF)).isEqualTo(true);
    }

    @Test
    @DisplayName("Provided product should have the price equal to 7 or lower.")
    void shouldBeSevenOrLess() {
        assertThat(isSevenOrLess(Attractions.MINI_GOLF)).isNotEqualTo(false);
    }

    @Test
    @DisplayName("Should return a nem of the attraction of present.")
    void shouldReturnAProvidedName() {
        assertEquals(Optional.of("MediumDrink"), findingANameIfPresent("MediumDrink"));
    }

    @Test
    @DisplayName("Should return an empty optional.")
    void shouldReturnEmptyOptional() {
        assertThat(findingANameIfPresent("OrangeJuice").equals(Optional.empty()));
    }

    @Test
    @DisplayName("Should return the price of the attraction doubled.")
    void shouldDoubleTheAmount() {
        assertThat(priceForTwo(Attractions.DARTS)).isEqualTo(6);
    }

    @BeforeEach
    void setUp() {
        taxProvider = Mockito.mock(TaxProvider.class);
        streamMethods = new StreamMethods(taxProvider);
        streamSupportingMethods = new StreamSupportingMethods(taxProvider);
    }


}
