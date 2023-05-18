package com.kodilla.good.patterns.foodShop;

public class HealthyShopStrategy implements OrderStrategy {
    @Override
    public void process(String supplier, int quantity, String product) {
        System.out.println("Wykonuję zamówienie dla dostawcy: " + supplier);
        System.out.println("Zamawiam " + quantity + " sztuk zdrowego produktu '" + product + "' z HealthyShop");
        System.out.println("Zamówienie zrealizowane przez HealthyShop");
    }
}
