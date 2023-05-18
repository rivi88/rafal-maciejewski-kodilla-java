package com.kodilla.good.patterns.airCompany;

import java.util.List;

public class FlightSearchEngine {

    public static void main(String[] args) {
        FlightManager flightManager = new FlightManager();

        flightManager.addFlight(new Flight("GDAŃSK", "WROCŁAW"));
        flightManager.addFlight(new Flight("GDAŃSK", "KRAKÓW"));
        flightManager.addFlight(new Flight("KRAKÓW", "WROCŁAW"));
        flightManager.addFlight(new Flight("WARSZAWA", "KRAKÓW"));

        List<Flight> flightsFromGdansk = flightManager.findFlightsFromCity("GDAŃSK");
        System.out.println("Loty z Gdańska:");
        for (Flight flight : flightsFromGdansk) {
            System.out.println(flight.getSourceCity() + " -> " + flight.getDestinationCity());
        }

        List<Flight> flightsToKrakow = flightManager.findFlightsToCity("KRAKÓW");
        System.out.println("\nLoty do Krakowa:");
        for (Flight flight : flightsToKrakow) {
            System.out.println(flight.getSourceCity() + " -> " + flight.getDestinationCity());
        }

        List<Flight> flightsViaKrakow = flightManager.findFlightsViaCity("GDAŃSK", "KRAKÓW", "WROCŁAW");
        System.out.println("\nLoty z Gdańska przez Kraków do Wrocławia:");
        for (Flight flight : flightsViaKrakow) {
            System.out.println(flight.getSourceCity() + " -> " + flight.getDestinationCity());
        }
    }


}
