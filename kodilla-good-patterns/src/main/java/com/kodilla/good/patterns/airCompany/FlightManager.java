package com.kodilla.good.patterns.airCompany;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightManager {
    private List<Flight> flights;

    public FlightManager() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> findFlightsFromCity(String sourceCity) {
        return flights.stream()
                .filter(flight -> flight.getSourceCity().equals(sourceCity))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsToCity(String destinationCity) {
        return flights.stream()
                .filter(flight -> flight.getDestinationCity().equals(destinationCity))
                .collect(Collectors.toList());
    }

    public List<Flight> findFlightsViaCity(String sourceCity, String viaCity, String destinationCity) {
        return flights.stream()
                .filter(flight -> flight.getSourceCity().equals(sourceCity))
                .filter(flight -> flight.getDestinationCity().equals(viaCity))
                .flatMap(flight -> flights.stream()
                        .filter(f -> f.getSourceCity().equals(viaCity))
                        .filter(f -> f.getDestinationCity().equals(destinationCity))
                )
                .collect(Collectors.toList());
    }
}

