package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    World world = new World();

    @Test
    void testGetPeopleQuantityWhenListIsEmpty() {
        // Given

        // When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        // Then
        assertEquals(BigDecimal.ZERO, peopleQuantity);
    }

    @Test
    void testGetPeopleQuantityWhenChinaHas10People() {
        // Given
        ArrayList<Country> countryList = new ArrayList<>();
        countryList.add(new Country("China", BigDecimal.valueOf(10)));
        Continent asia = new Continent("Asia", countryList);
        world.addContinent(asia);

        // When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        // Then
        assertEquals(BigDecimal.valueOf(10), peopleQuantity);
    }

    @Test
    void testGetPeopleQuantityWhenContinentHas3County() {
        // Given
        ArrayList<Country> countryAsia = new ArrayList<>();
        countryAsia.add(new Country("China", BigDecimal.valueOf(10)));
        countryAsia.add(new Country("India", BigDecimal.valueOf(10)));
        countryAsia.add(new Country("Japan", BigDecimal.valueOf(10)));
        Continent asia = new Continent("Asia", countryAsia);
        world.addContinent(asia);
        ArrayList<Country> countryEurope = new ArrayList<>();
        countryEurope.add(new Country("Poland", BigDecimal.valueOf(10)));
        countryEurope.add(new Country("France", BigDecimal.valueOf(10)));
        countryEurope.add(new Country("Spain", BigDecimal.valueOf(10)));
        Continent europe = new Continent("Europe", countryEurope);
        world.addContinent(europe);

        // When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        // Then
        assertEquals(BigDecimal.valueOf(60), peopleQuantity);
    }

}
