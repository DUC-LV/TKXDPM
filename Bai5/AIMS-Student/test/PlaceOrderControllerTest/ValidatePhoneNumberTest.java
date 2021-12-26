package controller.PlaceOrderControllerTest;

import controller.PlaceOrderController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatePhoneNumberTest {
    //Duc - 20173040
    private PlaceOrderController placeOrderController;
    @BeforeEach
    void setUp() {
        placeOrderController = new PlaceOrderController();
    }
    @ParameterizedTest
    @CsvSource({
            "0123456789, true",
            "01234, false",
            "abc123, false",
            "1234567890, false"
    })

    void validatePhoneNumber(String phone, boolean expected) {
        //when
        boolean rs = placeOrderController.validatePhoneNumber(phone);
        //then
        assertEquals(expected, rs);
    }
}