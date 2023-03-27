package com.kodilla.exception.test;

public class AppMain {

    public static void main(String[] args) {
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight1 = new Flight("New York", "London");
        searchFlight(flightSearcher, flight1);
        Flight flight2 = new Flight("New York", "Skierniewice");
        searchFlight(flightSearcher, flight2);
        Flight flight3 = new Flight("Paris", "New York");
        searchFlight(flightSearcher, flight3);
        Flight flight4 = new Flight("London", "Tokyo");
        searchFlight(flightSearcher, flight4);

    }

    private static void searchFlight(FlightSearcher flightSearcher, Flight flight) {
        System.out.println("Searching flight: " + flight);
        try {
            flightSearcher.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("We don't have flights to " + flight.getArrivalAirport());
        }
    }
}

