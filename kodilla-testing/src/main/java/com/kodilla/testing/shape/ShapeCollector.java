package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);

    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    int getSize() {
        return shapes.size();


    }

    public Shape getFigure(int n) {
        return shapes.get(n);


    }

    public String showFigures() {
        return shapes.toString();
    }
}
