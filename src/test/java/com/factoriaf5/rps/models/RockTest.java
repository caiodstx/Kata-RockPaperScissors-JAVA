package com.factoriaf5.rps.models;

import static org.junit.Assert.*;

import com.factoriaf5.rps.domain.models.Rock;

import org.junit.Test;

public class RockTest {

    @Test

    public void isRock() {
        Rock rock = new Rock();
        String result = rock.getName();
        assertEquals("Rock", result);
    }

}
