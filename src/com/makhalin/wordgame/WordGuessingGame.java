package com.makhalin.wordgame;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {

    private String wordToGuess;
    private char[] guessedLetters;
    private int attempts;
    private static int countWins;
    private static int countLosses;

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
        Scanner scanner = new Scanner(System.in);
        boolean userHasWon = false;

        while (attempts > 0 && !userHasWon) {
            displayState();
            System.out.println("You have " + attempts + " attempts left...");
            System.out.print("Guess a letter: ");

            char guess = scanner.nextLine().toLowerCase().charAt(0);
            if (processGuess(guess)){
                System.out.println("Correct!");
                if (new String(guessedLetters).equals(wordToGuess)) {
                    System.out.println("You have guessed the word! You win!");
                    displayState();
                    userHasWon = true;
                    countWins++;
                }
            }
            else {
                System.out.println("That guess was incorrect");
                attempts--;
            }
        }

        if (!userHasWon) {
            System.out.println("You're out of guesses! You lose");
            countLosses++;
        }
    }

    private boolean processGuess(char letter) {
        boolean letterFound = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                guessedLetters[i] = letter;
                letterFound = true;
            }
        }
        return letterFound;
    }

    private void displayState() {
        System.out.println("Guessed letters: " + new String(guessedLetters));
    }

    public void displayResults() {
        System.out.println("Your results!\nTotal wins: " + countWins + "\nTotal losses: " + countLosses);
    }
}
