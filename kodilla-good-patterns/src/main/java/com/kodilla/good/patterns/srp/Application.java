package com.kodilla.good.patterns.srp;

public class Application {

    public static void main(String[] args) {
        RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
        RentRequest rentRequest = rentRequestRetriever.retrieve();

        RentalProcessor rentalProcessor = new RentalProcessor(
                (InformationService) new MailService(), (RentalService) new CarRentalService(), (RentalRepository) new CarRentalRepository());
        rentalProcessor.process(rentRequest);
    }

}