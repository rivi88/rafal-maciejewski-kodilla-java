package com.kodilla.good.patterns.foodShop;

public class Food2Door {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.addSupplierStrategy("ExtraFoodShop", new ExtraFoodShopStrategy());
        orderProcessor.addSupplierStrategy("HealthyShop", new HealthyShopStrategy());
        orderProcessor.addSupplierStrategy("GlutenFreeShop", new GlutenFreeShopStrategy());

        orderProcessor.processOrder("ExtraFoodShop", 10, "Mleko");

        orderProcessor.processOrder("HealthyShop", 5, "Warzywa");

        orderProcessor.processOrder("GlutenFreeShop", 3, "Chleb");
    }
}
