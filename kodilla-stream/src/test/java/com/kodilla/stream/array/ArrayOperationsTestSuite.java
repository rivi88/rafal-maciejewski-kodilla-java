package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        // Given
        List<Integer> listNumbers = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            listNumbers.add(i);
        }
        // When
        double result = ArrayOperations.getAverage(listNumbers);
        // Then
        Assertions.assertEquals(10.5, result, 0.001);
    }
}