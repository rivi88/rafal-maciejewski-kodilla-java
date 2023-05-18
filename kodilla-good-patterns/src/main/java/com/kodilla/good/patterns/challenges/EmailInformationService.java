package com.kodilla.good.patterns.challenges;

public class EmailInformationService implements InformationService {
    @Override
    public void inform(Object user) {
        System.out.println("Zamówienie przyjęte");
    }
}
