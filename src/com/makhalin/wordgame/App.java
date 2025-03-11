package com.makhalin.wordgame;

public class App {

    public static void main(String[] args) {
        String[] words = {"java", "programming", "class", "computer", "method"};
        WordGuessingGame game = new WordGuessingGame(words, 10);
        game.play();
    }
}
