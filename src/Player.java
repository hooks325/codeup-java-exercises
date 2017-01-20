/**
 * Created by nedwaldie on 1/18/17.
 */
public class Player {
    String name;
    String choice;

    public Player() {}

    public void setPlayer(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    public static String compare(String playerChoice, String choice) {
        if (playerChoice.equalsIgnoreCase("rock") && choice.equalsIgnoreCase("scissors")) {
            return "You win!";
        } else if (playerChoice.equalsIgnoreCase("paper") && choice.equalsIgnoreCase("rock")) {
            return "You win!";
        } else if (playerChoice.equalsIgnoreCase("scissors") && choice.equalsIgnoreCase("paper")) {
            return "You win!";
        } else if (playerChoice.equalsIgnoreCase(choice)) {
            return "You tied!";
        } else {
            return "You lose!";
        }
    }
}
