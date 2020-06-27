package design.repository;

import design.Constants.Attractions;

import java.util.Arrays;
import java.util.List;
import static design.Constants.Attractions.*;

public class AttractionsList {

    public static List<Attractions> getAttractions() {
     return Arrays.asList(
                LIGHT_DRINK,
                MEDIUM_DIRNK,
                HEAVY_DRINK,
                ALCOHOLFREE_DRINK,
                LIGHT_MEAL,
                BIG_MEAL,
                DARTS,
                FUSSBALL,
                MINI_GOLF,
                DANCEFLOOR_ACCESS
        );
    }
}
