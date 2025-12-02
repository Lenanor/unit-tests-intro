package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @Test
    @DisplayName("Should return the sum of two ints")
    void addNumbers() {
        // Act
        int result = calculator.addNumbers(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    void addOverflowNumber() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class, () -> calculator.addNumbers(Integer.MAX_VALUE, 1)
        );

        assertEquals("Integer overflow occurred", exception.getMessage());
    }

    @Test
    @DisplayName("Should return a positive result of substraction")
    void subtractNumbers() {
        int result = calculator.subtractNumbers(10, 3);
        assertEquals(7, result);
    }

    @Test
    @DisplayName("Should return a negative result of substraction")
    void subtractNumbersNegative() {
        int result = calculator.subtractNumbers(3, 10);
        assertEquals(-7, result);
    }

    @Test
    void subtractWithOverflow() {
        assertThrows(ArithmeticException.class, () -> calculator.subtractNumbers(Integer.MIN_VALUE, 1));
    }

    @Test
    void multiply() {
        double result = calculator.multiply(2.5, 8.33);
        assertEquals(20.825, result, 1e-9);
    }

    @Test
    void divideNumbers() {
        Double result = calculator.divideNumbers(2.9876, 2.334);
        assertEquals(1.2800342759211654, result, 1e-9);
    }

    @Test
    void divideNumbersThrowsException() {
        ArithmeticException exception = assertThrows(
                ArithmeticException.class, () -> calculator.divideNumbers(10, 0)
        );

        assertEquals("Denominator can not be 0!", exception.getMessage());
    }

    @Test
    void absoluteValueWithPositiveNumber() {
        double result = calculator.absoluteValue(5);
        assertEquals(5, result, 1e-9);
    }

    @Test
    void absoluteValueWithNegativeNumber() {
        double result = calculator.absoluteValue(-5);
        assertEquals(5, result, 1e-9);
    }

    @Test
    void absoluteValueZero() {
        double result = calculator.absoluteValue(0);
        assertEquals(0.0, result, 1e-9);
    }

    @Test
    void isEven() {
        boolean result = calculator.isEven(4);
        assertEquals(true, result);
    }

    @Test
    void isNotEven() {
        boolean result = calculator.isEven(5);
        assertEquals(false, result);
    }

    @Test
    void getMaxNumber() {
        List<Integer> list = List.of(5, 3, 2);
        int result = calculator.maxValue(list);
        assertEquals(5, result);
    }

    @Test
    void getMaxNegativeNumber() {
        List<Integer> list = List.of(-5, -3, -2);
        int result = calculator.maxValue(list);
        assertEquals(-2, result);
    }

    @Test
    void getMaxNumberEmptyList() {
        List<Integer> list = List.of();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class, () -> calculator.maxValue(list)
        );

        assertEquals("List can not be empty!", exception.getMessage());
    }
}
