package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

class SudokuBoard {
    private List<SudokuRow> rows;

    public SudokuBoard() {
        rows = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            rows.add(new SudokuRow());
        }
    }

    public boolean placeNumber(int row, int col, int value) {
        return rows.get(row).placeNumber(col, value);
    }

    public boolean solve() {
        return solveSudoku();
    }

    private boolean solveSudoku() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                SudokuElement element = rows.get(i).getElement(j + 1);
                if (element.isEmpty()) {
                    for (int num = 1; num <= 9; num++) {
                        if (isNumberValid(i, j, num)) {
                            element.setValue(num);
                            if (solveSudoku()) {
                                return true;
                            }
                            element.clearValue();
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isNumberValid(int row, int col, int value) {
        return !isNumberUsedInRow(row, value) &&
                !isNumberUsedInColumn(col, value) &&
                !isNumberUsedInBlock(row, col, value);
    }

    private boolean isNumberUsedInRow(int row, int value) {
        SudokuRow sudokuRow = rows.get(row);
        return sudokuRow.containsValue(value);
    }

    private boolean isNumberUsedInColumn(int col, int value) {
        for (SudokuRow row : rows) {
            SudokuElement element = row.getElement(col);
            if (element.getValue() == value) {
                return true;
            }
        }
        return false;
    }

    private boolean isNumberUsedInBlock(int row, int col, int value) {
        int blockRow = row / 3;
        int blockCol = col / 3;
        int startRow = blockRow * 3;
        int startCol = blockCol * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                SudokuElement element = rows.get(i).getElement(j + 1);
                if (element.getValue() == value) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("    1 2 3   4 5 6   7 8 9\n");
        sb.append("  +-------+-------+-------+\n");
        for (int i = 0; i < 9; i++) {
            if (i == 3 || i == 6) {
                sb.append("  +-------+-------+-------+\n");
            }
            sb.append(i + 1).append(" |");
            for (int j = 0; j < 9; j++) {
                SudokuElement element = rows.get(i).getElement(j + 1);
                int value = element.getValue();
                sb.append(value > 0 ? " " + value : "  ");
                if ((j + 1) % 3 == 0) {
                    sb.append(" |");
                }
            }
            sb.append("\n");
        }
        sb.append("  +-------+-------+-------+");
        return sb.toString();
    }
}