package com.kodilla.testing.shape;

public class Square implements Shape {

    public int side;
    String name;

    public Square(String name, int side) {
        this.name = name;
        this.side = side;

    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public int getField() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square";
    }
}
