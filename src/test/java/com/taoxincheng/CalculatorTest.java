package com.taoxincheng;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private final Calculator c = new Calculator();

    @Test
    void addWorks() {
        assertEquals(5.0, c.eval("2", "+", "3"));
    }

    @Test
    void subtractWorks() {
        assertEquals(-1.0, c.eval("2", "-", "3"));
    }

    @Test
    void multiplyWorks() {
        assertEquals(6.0, c.eval("2", "*", "3"));
    }

    @Test
    void divideWorks() {
        assertEquals(2.0, c.eval("10", "/", "5"));
    }

    @Test
    void divideByZeroThrows() {
        assertThrows(ArithmeticException.class, () -> c.eval("10", "/", "0"));
    }

    @Test
    void zeroOperandBoundary() {
        assertEquals(0.0, c.eval("0", "+", "0"));
    }

    @Test
    void negativeOperandBoundary() {
        assertEquals(-5.0, c.eval("-2", "*", "2.5"));
    }

    @Test
    void blankInputThrows() {
        assertThrows(IllegalArgumentException.class, () -> c.eval("", "+", "2"));
    }

    @Test
    void unknownOperatorThrows() {
        assertThrows(IllegalArgumentException.class, () -> c.eval("2", "%", "3"));
    }
}
