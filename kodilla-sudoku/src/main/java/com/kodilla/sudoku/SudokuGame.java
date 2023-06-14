package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuGame {
    private SudokuBoard board;
    private Scanner scanner;

    public SudokuGame() {
        board = new SudokuBoard();
        scanner = new Scanner(System.in);
    }

    public boolean resolveSudoku() {
        System.out.println("Wprowadź współrzędne i wartość (np. 2,3,9) lub wpisz 'SUDOKU' aby rozwiązać Sudoku:");

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("SUDOKU")) {
                if (board.solve()) {
                    System.out.println("Rozwiązanie Sudoku:");
                    System.out.println(board);
                } else {
                    System.out.println("Nieprawidłowe Sudoku. Brak rozwiązania.");
                }
                break;
            } else {
                String[] parts = userInput.split(",");
                if (parts.length == 3) {
                    try {
                        int row = Integer.parseInt(parts[0].trim()) - 1;
                        int col = Integer.parseInt(parts[1].trim()) - 1;
                        int value = Integer.parseInt(parts[2].trim());
                        if (board.placeNumber(row, col, value)) {
                            System.out.println(board);
                        } else {
                            System.out.println("Nieprawidłowe współrzędne lub wartość.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Nieprawidłowy format danych.");
                    }
                } else {
                    System.out.println("Nieprawidłowy format danych.");
                }
            }
        }

        System.out.println("Czy chcesz rozwiązać kolejne Sudoku? (Tak/Nie)");
        String userChoice = scanner.nextLine();

        return userChoice.equalsIgnoreCase("Tak");
    }

    public static void main(String[] args) {
        boolean gameFinished = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameFinished) {
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
        }
    }
}
