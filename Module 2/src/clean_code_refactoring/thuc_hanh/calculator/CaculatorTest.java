package clean_code_refactoring.thuc_hanh.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int expected = 2;
        int result = Calculator.calculate(1, 1, '+');
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int expected = 1;

        int result = Calculator.calculate(2, 1, '-');
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int expected = 4;
        int result = Calculator.calculate(2, 2, '*');
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int expected = 2;
        int result = Calculator.calculate(6, 3, '/');
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        assertThrows(RuntimeException.class,
                ()-> Calculator.calculate(2, 0, '/'));
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        assertThrows(RuntimeException.class,
                ()-> Calculator.calculate(2, 0, '='));
    }
}