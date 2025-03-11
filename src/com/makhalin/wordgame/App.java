package com.makhalin.wordgame;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String[] words = {"java", "programming", "class", "computer", "method"};
        Scanner scanner = new Scanner(System.in);

        do {
            WordGuessingGame game = new WordGuessingGame(words, 10);

            game.play();
            game.displayResults();
            System.out.println("Do you want to play again Y/N?");
        } while (scanner.nextLine().toLowerCase().charAt(0) == 'y');
    }
}
