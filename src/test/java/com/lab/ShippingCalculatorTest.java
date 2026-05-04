package com.lab;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
public class ShippingCalculatorTest {
    ShippingCalculator calc = new ShippingCalculator();

    @Test
    void testStandard() {
        assertEquals(15000.0, calc.calculate(5, "STANDARD"));
    }

    @Test
    void testExpress() {
        assertEquals(45000.0, calc.calculate(5, "EXPRESS"));
    }

    @Test
    void testInvalidWeight() {
        assertThrows(IllegalArgumentException.class,
            () -> calc.calculate(-1, "STANDARD"));
    }
    @Test
    void testNullType() {
        assertThrows(NullPointerException.class, () -> calc.calculate(5, null));
}

}


