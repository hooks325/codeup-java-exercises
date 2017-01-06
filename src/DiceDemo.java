import java.util.Random;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/6/17.
 */
public class DiceDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfSides;

        System.out.println("Enter the number of sides on the dice you want: ");
        numberOfSides = sc.nextInt();

        System.out.println("Rolling the dice...\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        int numberOne = randomDice(numberOfSides);
        int numberTwo = randomDice(numberOfSides);
        System.out.println("The first die rolled a " + numberOne + " " + "The second die rolled a  " + numberTwo);
        System.out.println("The result is " + (numberOne + numberTwo));
    }

    public static int randomDice(int numberOfSides) {
        Random rand = new Random();
        int n = rand.nextInt(numberOfSides) + 1;
        return n;
    }
}
