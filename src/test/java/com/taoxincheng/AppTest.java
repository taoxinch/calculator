package com.taoxincheng;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Calculator c = new Calculator();

    @Test
    void addWorks() {
        assertEquals(4.0, c.eval("2", "+", "2"));
    }

    @Test
    void divideWorks() {
        assertEquals(2.0, c.eval("10", "/", "5"));
    }

    @Test
    void blankInputThrows() {
        assertThrows(IllegalArgumentException.class, () -> {
            c.eval("", "+", "2");
        });
    }
}