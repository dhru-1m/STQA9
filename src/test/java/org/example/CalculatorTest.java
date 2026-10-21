package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(20, calculator.add(5, 10));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(0, calculator.subtract(5, 5));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(30, calculator.multiply(5, 6));
    }

    @Test
    void shouldDivideTwoNumbers() {
        assertEquals(1, calculator.divide(2, 2));
    }

    @Test
    void shouldRejectDivisionByZero() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(15, 0));
    }
}
