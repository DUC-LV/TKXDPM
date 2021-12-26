package controller.PlaceRushOrderControllerTest;

import controller.PlaceRushOrderController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateDeliveryDateTest {

    private PlaceRushOrderController placeRushOrderController;
    @BeforeEach
    void setUp() {
        placeRushOrderController = new PlaceRushOrderController();
    }
    @ParameterizedTest
    @CsvSource({
            "2021-12-11, true",
            "2021-12-10, false",
            "2021-12-09, false",
            ", false"
    })
    void validateDeliveryDate(String date, boolean expected){
        //when
        boolean rs = placeRushOrderController.validateDeliveryDate(date);
        //then
        assertEquals(expected, rs);
    }
}