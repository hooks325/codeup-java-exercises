import java.util.Scanner;

/**
 * Created by nedwaldie on 1/11/17.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RandomName name = new RandomName();

        String[] adjective = {"Sloppy", "Wet", "Tall", "Short", "Dry", "Clean", "Smelly", "Strong", "Weak","Little"};
        String[] noun = {"Cat", "Sock", "Ship", "Monkey", "Baby", "Hero", "Mom", "Dad", "Boy", "Girl"};
        String userWantsToContinue;

        System.out.println("Welocome to the Random name Generator App\n");

        try {
            Thread.sleep(1500);
            System.out.println("Generating...\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        do {
            String fullName = name.randomAdjective(adjective) + name.randomNoun(noun);
            System.out.println("Your random name is " + fullName + ".\n");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Do you want to generate another random name?");
            userWantsToContinue = sc.next();
        } while (userWantsToContinue.equalsIgnoreCase("yes"));
    }
}
