package com.factoriaf5.rps.application;

import static org.junit.Assert.assertEquals;

import com.factoriaf5.rps.domain.models.Paper;
import com.factoriaf5.rps.domain.models.Rock;
import com.factoriaf5.rps.domain.models.Scissors;

import org.junit.Test;

public class GameTest {

    @Test

    public void rockWinScissors() {
        Game game = new Game();
        Rock playerOne = new Rock();
        Scissors playerTwo = new Scissors();

        String result = game.playGame(playerOne.getName(), playerTwo.getName());

        assertEquals("Rock win", result);
    }

    @Test

    public void rockWinScissorsReverse() {
        Game game = new Game();
        Scissors playerOne = new Scissors();
        Rock playerTwo = new Rock();

        String result = game.playGame(playerOne.getName(), playerTwo.getName());

        assertEquals("Rock win", result);
    }

    @Test

    public void paperWinRock() {
        Game game = new Game();
        Paper playerOne = new Paper();
        Rock playerTwo = new Rock();

        String result = game.playGame(playerOne.getName(), playerTwo.getName());

        assertEquals("Paper win", result);
    }

    @Test

    public void paperWinRockReverse() {
        Game game = new Game();
        Rock playerOne = new Rock();
        Paper playerTwo = new Paper();

        String result = game.playGame(playerOne.getName(), playerTwo.getName());

        assertEquals("Paper win", result);
    }

    @Test

    public void scissorsWinPaper() {
        Game game = new Game();
        Scissors playerOne = new Scissors();
        Paper playerTwo = new Paper();

        String result = game.playGame(playerOne.getName(), playerTwo.getName());

        assertEquals("Scissors win", result);
    }

    @Test
    public void scissorsWinPaperReverse() {
        Game game = new Game();
        Paper playerOne = new Paper();
        Scissors playerTwo = new Scissors();

        String result = game.playGame(playerOne.getName(), playerTwo.getName());

        assertEquals("Scissors win", result);
    }

}