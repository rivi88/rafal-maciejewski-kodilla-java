package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

class SudokuRow {
    private List<SudokuElement> elements;

    public SudokuRow() {
        elements = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            elements.add(new SudokuElement());
        }
    }

    public SudokuElement getElement(int col) {
        return elements.get(col - 1);
    }

    public boolean placeNumber(int col, int value) {
        SudokuElement element = elements.get(col - 1);
        if (element.isEmpty()) {
            element.setValue(value);
            return true;
        }
        return false;
    }

    public boolean containsValue(int value) {
        for (SudokuElement element : elements) {
            if (element.getValue() == value) {
                return true;
            }
        }
        return false;
    }

    public boolean isFilled() {
        for (SudokuElement element : elements) {
            if (element.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        for (SudokuElement element : elements) {
            element.clearValue();
        }
    }
}

