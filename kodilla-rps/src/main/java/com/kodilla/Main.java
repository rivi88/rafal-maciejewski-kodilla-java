package com.kodilla;

import com.kodilla.rps.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.print("Enter the number of rounds: ");
        int numRounds = scanner.nextInt();

        Game game = new Game(playerName, numRounds);
        game.play();
    }
}