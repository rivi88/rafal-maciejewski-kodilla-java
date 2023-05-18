package com.kodilla.good.patterns.foodShop;

public class Food2Door {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.setStrategy(new ExtraFoodShopStrategy());
        orderProcessor.processOrder("ExtraFoodShop", 10, "Mleko");

        orderProcessor.setStrategy(new HealthyShopStrategy());
        orderProcessor.processOrder("HealthyShop", 5, "Warzywa");

        orderProcessor.setStrategy(new GlutenFreeShopStrategy());
        orderProcessor.processOrder("GlutenFreeShop", 3, "Chleb");
    }
}


