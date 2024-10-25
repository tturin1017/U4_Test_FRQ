package com.example.project;

public class Main{

    public static void main(String[] args) {
        WordMatch game = new WordMatch("mississippi");
        int expectedOutput = 4;
        String guess = "i";
        int studentOutput = game.scoreGuess(guess);
        System.out.println(expectedOutput);
        System.out.println(studentOutput);
        
    }
}