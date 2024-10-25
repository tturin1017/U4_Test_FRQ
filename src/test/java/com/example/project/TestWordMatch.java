package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestWordMatch{
    @Test
    public void testRow1A(){
        WordMatch game = new WordMatch("mississippi");
        int expectedOutput = 4;
        String guess = "i";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow2A(){
        WordMatch game = new WordMatch("mississippi");
        int expectedOutput = 18;
        String guess = "iss";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow3A(){
        WordMatch game = new WordMatch("mississippi");
        int expectedOutput = 36;
        String guess = "issipp";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow4A(){
        WordMatch game = new WordMatch("mississippi");
        int expectedOutput = 121;
        String guess = "mississippi";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow5A(){
        WordMatch game = new WordMatch("aaaabb");
        int expectedOutput = 4;
        String guess = "a";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow6A(){
        WordMatch game = new WordMatch("aaaabb");
        int expectedOutput = 12;
        String guess = "aa";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow7A(){
        WordMatch game = new WordMatch("aaaabb");
        int expectedOutput = 18;
        String guess = "aaa";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow8A(){
        WordMatch game = new WordMatch("aaaabb");
        int expectedOutput = 16;
        String guess = "aabb";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow9A(){
        WordMatch game = new WordMatch("aaaabb");
        int expectedOutput = 0;
        String guess = "c";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow1B(){
        WordMatch game = new WordMatch("concatenation");
        int expectedOutput = 9;
        String guess = "ten";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow2B(){
        WordMatch game = new WordMatch("concatenation");
        int expectedOutput = 36;
        String guess = "nation";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow3B(){
        WordMatch game = new WordMatch("concatenation");
        String expectedOutput = "nation";
        String studentOutput = game.findBetterGuess("ten","nation");
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow4B(){
        WordMatch game = new WordMatch("concatenation");
        int expectedOutput = 9;
        String guess = "con";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow5B(){
        WordMatch game = new WordMatch("concatenation");
        int expectedOutput = 9;
        String guess = "cat";
        int studentOutput = game.scoreGuess(guess);
        assertEquals(studentOutput,expectedOutput); 
    }

    @Test
    public void testRow6B(){
        WordMatch game = new WordMatch("concatenation");
        String expectedOutput = "con";
        String studentOutput = game.findBetterGuess("con","cat");
        assertEquals(studentOutput,expectedOutput); 
    }




}