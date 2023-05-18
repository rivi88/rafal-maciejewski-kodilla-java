package com.kodilla.good.patterns.foodShop;

public interface OrderStrategy {
    void process(String supplier, int quantity, String product);
}
