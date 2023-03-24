package com.kodilla.power;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerTest {

    @Test
    void whenBaseIs0() {
        // Given
        Power power = new Power();

        // When

        // Then
        assertEquals(0, power.power(0, 2));
    }

    @Test
    void whenExponentIs0() {
        // Given
        Power power = new Power();

        // When

        // Then
        assertEquals(1, power.power(3, 0));
    }


    @Test
    void whenExponentIs1() {
        // Given
        Power power = new Power();

        // When

        // Then
        assertEquals(3, power.power(3, 1));
    }
}