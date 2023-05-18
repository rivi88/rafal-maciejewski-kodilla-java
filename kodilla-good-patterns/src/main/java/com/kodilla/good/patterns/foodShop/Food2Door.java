package com.kodilla.good.patterns.foodShop;

public class Food2Door {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        // Przykładowe zamówienie dla ExtraFoodShop
        orderProcessor.setStrategy(new ExtraFoodShopStrategy());
        orderProcessor.processOrder("ExtraFoodShop", 10, "Mleko");

        // Przykładowe zamówienie dla HealthyShop
        orderProcessor.setStrategy(new HealthyShopStrategy());
        orderProcessor.processOrder("HealthyShop", 5, "Warzywa");

        // Przykładowe zamówienie dla GlutenFreeShop
        orderProcessor.setStrategy(new GlutenFreeShopStrategy());
        orderProcessor.processOrder("GlutenFreeShop", 3, "Chleb");
    }
}


