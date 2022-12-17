package CoffeeMachine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        System.out.println("""
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
                Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!""");
        System.out.println("Write how many cups of coffee you will need:");
        Scanner userInput = new Scanner(System.in);
        int coffeeCups = Integer.parseInt(userInput.nextLine());
        System.out.printf("For %d cups of coffee you will need:\n%d ml of water\n%d ml of milk\n%d g of coffee beans",
                coffeeCups, coffeeCups * 200, coffeeCups * 50, coffeeCups * 15);
    }
}
