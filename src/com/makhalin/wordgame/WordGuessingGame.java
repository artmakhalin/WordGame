package com.makhalin.wordgame;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {

    private String wordToGuess;
    private char[] guessedLetters;
    private int attempts;

    public WordGuessingGame(String[] wordList, int maxAttempts) {
        Random rand = new Random();
        this.wordToGuess = wordList[rand.nextInt(wordList.length)];
        this.guessedLetters = new char[this.wordToGuess.length()];
        for (int i = 0; i < this.guessedLetters.length; i++) {
            this.guessedLetters[i] = '_';
        }
        this.attempts = maxAttempts;
    }

    public void play() {
        System.out.println("The word is: " + wordToGuess);
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("You have " + attempts + " attempts left...");
            System.out.print("Guess a letter: ");

            attempts--;
        }
    }
}
