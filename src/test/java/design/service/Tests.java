package design.service;


import design.Constants.Attractions;
import org.junit.Before;
import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThat;

import static design.service.StreamSupportingMethods.*;

class Tests {

    @Test
    void shouldBeLessThanFive(){
        assertThat(isLessThanFive(Attractions.MINI_GOLF)).isEqualTo(true);
    }

    @Test
    void shouldBeSevenOrLess(){
        assertThat(isSevenOrLess(Attractions.MINI_GOLF)).isNotEqualTo(false);
    }

    void


}
