package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Product product;
    private User user;


    public OrderRequest(User user, Product product) {
    }

    public Object getProduct() {
        return this.product;

    }

    public Object getUser() {
        return user;
    }
}
