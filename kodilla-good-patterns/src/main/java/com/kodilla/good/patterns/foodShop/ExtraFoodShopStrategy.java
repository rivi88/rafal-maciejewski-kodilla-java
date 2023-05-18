package com.kodilla.good.patterns.foodShop;

public class ExtraFoodShopStrategy implements OrderStrategy {
    @Override
    public void process(String supplier, int quantity, String product) {
        System.out.println("Realizuję zamówienie dla dostawcy: " + supplier);
        System.out.println("Zamawiam " + quantity + " sztuk produktu '" + product + "' w sklepie ExtraFoodShop");
        System.out.println("Zamówienie zrealizowane przez ExtraFoodShop");
    }
}