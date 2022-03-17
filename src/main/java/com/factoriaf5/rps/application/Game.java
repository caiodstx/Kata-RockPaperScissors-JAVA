package com.factoriaf5.rps.application;

public class Game {

    public String playGame(String playerOne, String playerTwo) {

        String winner = this.checkWinner(playerOne, playerTwo);
        return winner;

    }

    public String checkWinner(String playerOne, String playerTwo) {

        if (playerOne == "Rock" && playerTwo == "Scissors") {
            return "Rock win";
        }

        if (playerOne == "Scissors" && playerTwo == "Rock") {
            return "Rock win";
        }

        if (playerOne == "Rock" && playerTwo == "Paper") {
            return "Paper win";
        }

        if (playerOne == "Paper" && playerTwo == "Rock") {
            return "Paper win";
        }

        if (playerOne == "Scissors" && playerTwo == "Paper") {
            return "Scissors win";
        }

        if (playerOne == "Paper" && playerTwo == "Scissors") {
            return "Scissors win";
        }

        return "draw";
    }
}
