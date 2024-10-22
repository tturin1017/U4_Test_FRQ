package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class TestSpinnerGame {

    @Test
    void testSpin1(){
        SpinnerGame game = new SpinnerGame();
        int studentResult = game.spin(5,8);
        int expectedOutput = -1;
        switch(studentResult) {
            case 5:
              expectedOutput = 5;
              break;
            case 6:
              expectedOutput = 6;
              break;
            case 7:
                expectedOutput = 7;
                break;
            case 8:
                expectedOutput = 8;
                break;
            default:
                break;
          }
          assertEquals(studentResult,expectedOutput);
    }

    @Test
    void testSpin2(){
        SpinnerGame game = new SpinnerGame();
        int studentResult = game.spin(-1,0);
        int expectedOutput = 1;
        switch(studentResult) {
            case -1:
              expectedOutput = -1;
              break;
            case 0:
              expectedOutput = 0;
              break;
            default:
                break;
          }
          assertEquals(studentResult,expectedOutput);
    }

 
    @Test
    public void testPlayRoundRow1(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        SpinnerGame game = new SpinnerGame();
        // action
        game.playRound(9,6,0,0);
        // assertion
        assertEquals("You win! 3 points\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testPlayRoundRow2(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        SpinnerGame game = new SpinnerGame();
        // action
        game.playRound(3,7,0,0);
        // assertion
        assertEquals("You lose. -4 points\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testPlayRoundRow3(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        SpinnerGame game = new SpinnerGame();
        // action
        game.playRound(4,4,6,2);
        // assertion
        assertEquals("You win! 1 points\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testPlayRoundRow4(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        SpinnerGame game = new SpinnerGame();
        // action
        game.playRound(6,6,1,2);
        // assertion
        assertEquals("You lose. -1 points\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    public void testPlayRoundRow5(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        SpinnerGame game = new SpinnerGame();
        // action
        game.playRound(1,1,8,8);
        // assertion
        assertEquals("Tie. 0 points\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }
}
