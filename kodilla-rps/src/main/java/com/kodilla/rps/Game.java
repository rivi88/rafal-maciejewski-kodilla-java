package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private String playerName;
    private int numRounds;
    private int playerScore = 0;
    private int computerScore = 0;
    private int round = 1;

    public Game(String playerName, int numRounds) {
        this.playerName = playerName;
        this.numRounds = numRounds;
    }

    Scanner scanner;

    public void play() {
        scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock-Paper-Scissors, " + playerName + "!");
        System.out.println("You will play against the computer in a best of " + numRounds + " games.");

        while (round <= numRounds) {
            System.out.println("\nRound " + round + ":");

            System.out.print("Enter your move (1 = rock, 2 = paper, 3 = scissors): ");
            int playerMove = scanner.nextInt();

            int computerMove = random.nextInt(3) + 1;

            String moveNames[] = {"Rock", "Paper", "Scissors"};
            System.out.println(playerName + " played " + moveNames[playerMove - 1]);
            System.out.println("Computer played " + moveNames[computerMove - 1]);


            int result = (playerMove - computerMove + 3) % 3;
            if (result == 0) {
                System.out.println("Is's a tie!");
                playerScore++;
            } else if (result == 1) {
                System.out.println(playerName + " wins!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }
            System.out.println(playerName + ": " + playerScore + ", Computer: " + computerScore);

            round++;
        }


        printScore();
    }

    private void printScore() {
        if (playerScore > computerScore) {
            System.out.println(playerName + " wins the game!");
        } else if (computerScore > playerScore) {
            System.out.println("Computer wins the game!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private String askForText(String message) {
        System.out.println(message + ":");
        return scanner.nextLine();
    }

    private int askForNumber(String message) {
        System.out.println(message + ":");
        return scanner.nextInt();
    }
}

