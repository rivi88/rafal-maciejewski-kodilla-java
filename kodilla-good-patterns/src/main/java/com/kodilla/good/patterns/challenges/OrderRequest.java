package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private Product product;
    private User user;


    public OrderRequest(User user, Product product) {
        this.product = product;
        this.user = user;
    }

    public Product getProduct() {
        return this.product;

    }

    public User getUser() {
        return user;
    }
}
