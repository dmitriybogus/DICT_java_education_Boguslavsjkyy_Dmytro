package Hangman;

import java.util.Scanner;
import java.util.Random;

public class hangman {
    public static void main(String[] args) {
        String[] wordsArr = {"java", "kotlin", "python", "javascript"};

        Random randomIntGen = new Random();
        int randomInt = randomIntGen.nextInt(wordsArr.length);
        String word = wordsArr[randomInt];
        StringBuilder hiddenWord = new StringBuilder(word.substring(0, 2));
        hiddenWord.append("-".repeat(word.length() - 2));
        System.out.println("HANGMAN");
        System.out.printf("Guess the word %s:", hiddenWord);
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();
        if (answer.equals(word)) {
            System.out.println("You survived!");
        }
        else {
            System.out.println("You lost");
        }
    }
}
