package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {
        boolean endGame = false;
        while (!endGame) {
            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter your name: ");
//            String playerName = scanner.nextLine();
            String playerName = askForText("Enter your name", scanner);

//            System.out.print("Enter the number of rounds: ");
            int numRounds = askForNumber("Enter the number of rounds", scanner);

            Game game = new Game(playerName, numRounds);
            game.play();

            System.out.println("Enter \"n\" to start a new game or \"x\" to exit: ");
            String input = scanner.next();


            if ("n".equals(input)) {
                System.out.println("Press \"y\" for Yes and \"n\" for No to start new game");
                String yOrN = scanner.next();
                if ("n".equals(yOrN)) {
                    endGame = true;
                }

            }
            if ("x".equals(input)) {
                System.out.println("Press \"y\" for Yes and \"n\" for No to end game");
                String yOrN = scanner.next();
                if ("y".equals(yOrN)) {
                    endGame = true;
                }
            }
        }
        System.out.println("End Game");
    }

    private static String askForText(String message, Scanner scanner) {
        System.out.println(message + ":");
        return scanner.nextLine();
    }

    private static int askForNumber(String message, Scanner scanner) {
        System.out.println(message + ":");
        return scanner.nextInt();
    }
}


