package com.kodilla.testing.shape;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShapeCollectorTestSuite {
    private ShapeCollector shapeCollector = new ShapeCollector();

    @Nested
    @DisplayName("Test add and remove Figures")
    class AddAndRemove {
        @Test
        void testAddFiguresAndGetFigures() {
            //Given
            Circle circle = new Circle("Circle", 5);
            Square square = new Square("Square", 5);
            Triangle triangle = new Triangle("Triangle", 3, 2);
            //When
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //Then
            assertEquals(4, shapeCollector.getSize());
        }

        @Test
        void testRemoveFigures() {
            //Given
            Circle circle = new Circle("Circle", 5);
            shapeCollector.addFigure(circle);
            //When
            shapeCollector.removeFigure(circle);
            //Then
            assertEquals(0, shapeCollector.getSize());

        }
    }

    @Nested
    @DisplayName("Test check Get and Show method")
    class GetAndShow {
        @Test
        void testGetFigure() {
            //Given
            Circle circle = new Circle("Circle", 5);
            Square square = new Square("Square", 5);
            Triangle triangle = new Triangle("Triangle", 3, 2);

            //When
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //Then
            assertEquals(circle, shapeCollector.getFigure(0));
            assertEquals(square, shapeCollector.getFigure(1));
            assertEquals(triangle, shapeCollector.getFigure(2));
        }

        @Test
        void testShowFigure() {
            //Given
            Circle circle = new Circle("Circle", 5);
            Square square = new Square("Square", 5);
            Triangle triangle = new Triangle("Triangle", 3, 2);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //When

            String actual = shapeCollector.showFigures();
            //Then
            assertEquals("[Circle, Square, Triangle]", actual);
        }
    }
}