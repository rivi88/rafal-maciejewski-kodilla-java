package com.kodilla.good.patterns.foodShop;

public class OrderProcessor {
    private OrderStrategy strategy;

    public void setStrategy(OrderStrategy strategy) {
        this.strategy = strategy;
    }

    public void processOrder(String supplier, int quantity, String product) {
        strategy.process(supplier, quantity, product);
    }
}
