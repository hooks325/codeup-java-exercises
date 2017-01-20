import java.util.Scanner;

/**
 * Created by nedwaldie on 1/18/17.
 */
public class HumanPlayer extends Player {
//
    public String getMove() {
        Scanner scan = new Scanner(System.in);
        Roshambo[] listOfOptions = Roshambo.values();
        Validator validator = new Validator(scan);
        int userChoice = validator.getIntWithinRange("Choose 1. Rock, 2. Paper, or 3. Scissors", 1, 3);
        int index = userChoice - 1;
        return listOfOptions[index].toString();

    }

}
