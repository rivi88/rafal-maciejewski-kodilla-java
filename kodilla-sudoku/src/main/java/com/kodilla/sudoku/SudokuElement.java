package com.kodilla.sudoku;

class SudokuElement {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return value == 0;
    }

    public void clearValue() {
        value = 0;
    }
}
