import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.Scanner;

/**
 * Created by nedwaldie on 1/12/17.
 */
public class HighLowGameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);
        HighLow newGame = new HighLow();

        System.out.println("Welcome to the High Low Number Guessing Game! GOOD LUCK!\n");

        do {
            newGame.userNumber = validator.getIntWithinRange("Guess a number:", 0, 100);
            newGame.numberOfGuesses++;
            System.out.println(newGame.compareNumbers(newGame.userNumber, newGame.computerNumber, newGame.numberOfGuesses));
        } while (newGame.numberOfGuesses < 5);
    }
}
