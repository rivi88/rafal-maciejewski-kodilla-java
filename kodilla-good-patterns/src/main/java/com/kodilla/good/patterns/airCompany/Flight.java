package com.kodilla.good.patterns.airCompany;

import java.util.Objects;

public class Flight {
    private String sourceCity;
    private String destinationCity;

    public Flight(String sourceCity, String destinationCity) {
        this.sourceCity = sourceCity;
        this.destinationCity = destinationCity;
    }

    public String getSourceCity() {
        return sourceCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(sourceCity, flight.sourceCity) &&
                Objects.equals(destinationCity, flight.destinationCity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceCity, destinationCity);
    }
}
