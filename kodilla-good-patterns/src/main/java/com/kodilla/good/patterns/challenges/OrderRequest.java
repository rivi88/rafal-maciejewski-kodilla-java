package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Product product;
    private User user;


    public OrderRequest(User user, Product product) {
    }

    public Product getProduct() {
        return this.product;

    }

    public User getUser() {
        return user;
    }
}
