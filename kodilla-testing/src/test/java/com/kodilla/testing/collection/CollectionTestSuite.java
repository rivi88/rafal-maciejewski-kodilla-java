package com.kodilla.testing.collection;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollectionTestSuite {
    private final OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Test
    @DisplayName("Returns empty list when invoked with an empty list")
    void testOddNumbersExterminatorEmptyList() {
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(new ArrayList<>());
        assertEquals(0, evenNumbers.size());
    }

    @Test
    @DisplayName("Returns 4 even numbers when list contains 4 even numbers")
    void testOddNumbersExterminatorNormalList() {
        //given
        List<Integer> list = Arrays.asList(2, 5, 8, 11, 16, 14);
        //when
        List<Integer> evenNumbers = oddNumbersExterminator.exterminate(list);
        //then
        assertEquals(4, evenNumbers.size());

    }


}
