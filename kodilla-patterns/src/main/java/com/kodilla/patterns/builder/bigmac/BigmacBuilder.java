package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class BigmacBuilder {
    private String bun;
    private int burgers;
    private String sauce;
    private List<String> ingredients = new ArrayList<>();

    public BigmacBuilder bun(String bun) {
        this.bun = bun;
        return this;
    }

    public BigmacBuilder burgers(int burgers) {
        this.burgers = burgers;
        return this;
    }

    public BigmacBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public BigmacBuilder ingredient(String ingredient) {
        ingredients.add(ingredient);
        return this;
    }

    public Bigmac build() {
        return new Bigmac(bun, burgers, sauce, ingredients);
    }
}
