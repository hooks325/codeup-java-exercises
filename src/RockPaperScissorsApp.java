import java.util.Scanner;

/**
 * Created by nedwaldie on 1/18/17.
 */
public class RockPaperScissorsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);

        String anotherGame;
        String userName;
        String humanChoice;
        int opponent;

        System.out.println("                                                                                                     \n" +
                "                                              ,-.----.                                               \n" +
                ",-.----.                          ,-.         \\    /  \\                                              \n" +
                "\\    /  \\                     ,--/ /|         |   :    \\          ,-.----.                           \n" +
                ";   :    \\   ,---.          ,--. :/ |         |   |  .\\ :         \\    /  \\           __  ,-.        \n" +
                "|   | .\\ :  '   ,'\\         :  : ' /          .   :  |: |         |   :    |        ,' ,'/ /|        \n" +
                ".   : |: | /   /   |  ,---. |  '  /           |   |   \\ :,--.--.  |   | .\\ :  ,---. '  | |' |        \n" +
                "|   |  \\ :.   ; ,. : /     \\'  |  :           |   : .   /       \\ .   : |: | /     \\|  |   ,'        \n" +
                "|   : .  /'   | |: :/    / '|  |   \\          ;   | |`-.--.  .-. ||   |  \\ :/    /  '  :  /          \n" +
                ";   | |  \\'   | .; .    ' / '  : |. \\         |   | ;   \\__\\/: . .|   : .  .    ' / |  | '           \n" +
                "|   | ;\\  |   :    '   ; :__|  | ' \\ \\        :   ' |   ,\" .--.; |:     |`-'   ;   /;  : |           \n" +
                ":   ' | \\.'\\   \\  /'   | '.''  : |--'         :   : :  /  /  ,.  |:   : :  '   |  / |  , ;           \n" +
                ":   : :-'   `----' |   :    ;  |,'            |   | : ;  :   .'   |   | :  |   :    |---'            \n" +
                "|   |.'             \\   \\  /'--'              `---'.| |  ,     .-.`---'.|   \\   \\  /                 \n" +
                "`---'                `----'                     `---`  `--`---'     `---`    `----'                  \n" +
                "  .--.--.                                                                                            \n" +
                " /  /    '.           ,--,                                                                           \n" +
                "|  :  /`. /         ,--.'|                          ,---.   __  ,-.                                  \n" +
                ";  |  |--`          |  |,     .--.--.   .--.--.    '   ,'\\,' ,'/ /| .--.--.                          \n" +
                "|  :  ;_      ,---. `--'_    /  /    ' /  /    '  /   /   '  | |' |/  /    '                         \n" +
                " \\  \\    `.  /     \\,' ,'|  |  :  /`./|  :  /`./ .   ; ,. |  |   ,|  :  /`./                         \n" +
                "  `----.   \\/    / ''  | |  |  :  ;_  |  :  ;_   '   | |: '  :  / |  :  ;_                           \n" +
                "  __ \\  \\  .    ' / |  | :   \\  \\    `.\\  \\    `.'   | .; |  | '   \\  \\    `.                        \n" +
                " /  /`--'  '   ; :__'  : |__  `----.   \\`----.   |   :    ;  : |    `----.   \\                       \n" +
                "'--'.     /'   | '.'|  | '.'|/  /`--'  /  /`--'  /\\   \\  /|  , ;   /  /`--'  /                       \n" +
                "  `--'---' |   :    ;  :    '--'.     '--'.     /  `----'  ---'   '--'.     /                        \n" +
                "            \\   \\  /|  ,   /  `--'---'  `--'---'                    `--'---'                         \n" +
                "             `----'  ---`-'                                                                          \n" +
                "                                                                                                     \n");
        userName = validator.getString("Enter your name: ");

        do {
            HumanPlayer newHuman = new HumanPlayer();
            System.out.println("-----------------------------------------------------");
            opponent = validator.getIntWithinRange("Choose an opponent: \n1. Computer \n2. The Rock Guy", 1, 2);
            System.out.println("-----------------------------------------------------\n");

            newHuman.choice = newHuman.getMove();
            System.out.println("-----------------------------------------------------");


            if (opponent == 1) {
                CPUPlayer computer = new CPUPlayer();
                computer.choice = CPUPlayer.cpuChoice();

                System.out.println("-----------------------------------------------------");
                System.out.println("You chose " + newHuman.choice + " and the computer chose " + computer.choice + ".");

                System.out.println(Player.compare(newHuman.choice, computer.choice));
                System.out.println("-----------------------------------------------------");
            } else {
                RockGuy rock = new RockGuy();
                rock.choice = RockGuy.rockChoice();

                System.out.println("-----------------------------------------------------");
                System.out.println("You chose " + newHuman.choice + " and the computer chose " + rock.choice + ".");

                System.out.println(Player.compare(newHuman.choice, rock.choice));
                System.out.println("-----------------------------------------------------");
            }

            anotherGame = validator.getString("Hey " + userName + ", do you want to play again? ");
        } while (anotherGame.equalsIgnoreCase("yes"));
    }

}
