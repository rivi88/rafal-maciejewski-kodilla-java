package com.kodilla.testing.shape;

public class Circle implements Shape {


    public int radius;
    String name;


    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;

    }

    @Override
    public String getShapeName() {
        return name;

    }
    @Override
    public int getField() {
        return radius * radius * 3;
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
