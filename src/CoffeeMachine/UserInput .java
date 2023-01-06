package CoffeeMachine;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner userInput = new Scanner(System.in);

        coffeeMachine.start(userInput);

    }
}