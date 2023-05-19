package com.kodilla.good.patterns.foodShop;

public class GlutenFreeShopStrategy implements OrderStrategy {
    @Override
    public void process(String supplier, int quantity, String product) {
        System.out.println("Zlecam zamówienie dla dostawcy: " + supplier);
        System.out.println("Zamawiam " + quantity + " sztuk bezglutenowego produktu '" + product + "' z GlutenFreeShop");
        System.out.println("Zamówienie zrealizowane przez GlutenFreeShop");
    }
}

