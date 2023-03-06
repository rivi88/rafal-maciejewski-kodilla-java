package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public int side;
    public int height;
    String name;

    public Triangle(String name, int side, int height) {
        this.name = name;
        this.side = side;
        this.height = height;

    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return (side * height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
