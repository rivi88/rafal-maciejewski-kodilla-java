package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearcher {
    private HashMap<String, Boolean> airportMap;

    public void FlightSearch() {
        airportMap = new HashMap<String, Boolean>();
        airportMap.put("New York", true);
        airportMap.put("London", true);
        airportMap.put("Tokyo", false);
        airportMap.put("Paris", false);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!airportMap.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Route not found for " + flight.getArrivalAirport());
        }

        boolean isPossible = airportMap.get(flight.getArrivalAirport());
        if (!isPossible) {
            System.out.println("Sorry, there are no available flights to " + flight.getArrivalAirport());
            return;
        }

        System.out.println("There are available flights to " + flight.getArrivalAirport());
        // implementation of actual flight search logic
    }
}

