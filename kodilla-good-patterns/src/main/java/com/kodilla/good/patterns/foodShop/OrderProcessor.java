package com.kodilla.good.patterns.foodShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OrderProcessor {

    private final Map<String, OrderStrategy> suppliersStrategies = new HashMap<>();

    public void processOrder(String supplier, int quantity, String product) {
        OrderStrategy strategy = suppliersStrategies.get(supplier);
        strategy.process(supplier, quantity, product);
    }

    public void addSupplierStrategy(String supplier, OrderStrategy orderStrategy) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(orderStrategy);
        suppliersStrategies.put(supplier, orderStrategy);
    }
}
