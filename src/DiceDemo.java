import java.util.Scanner;

/**
 * Created by nedwaldie on 1/6/17.
 */
public class DiceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String wantToRollAgain;

        System.out.println("Welcome to the dice rolling app!");

        do {
            rollingTheDice(sc);
            System.out.println("Do you want to roll again?");
            wantToRollAgain = sc.next();
        } while (wantToRollAgain.equalsIgnoreCase("yes"));
    }

    public static void rollingTheDice(Scanner sc) {
        int numberOfSides;
        System.out.println("How many sides should the first die have?");
        numberOfSides = sc.nextInt();
        Die dieOne = new Die(numberOfSides);

        System.out.println("How many sides should the second die have?");
        numberOfSides = sc.nextInt();
        Die dieTwo = new Die(numberOfSides);

        System.out.println("Rolling...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The first die is " + dieOne.roll() + ".");
        System.out.println("The second die is " + dieTwo.roll() + ".");
        System.out.println("The total is " + (dieOne.currentValue + dieTwo.currentValue) + ".");
    }
}
