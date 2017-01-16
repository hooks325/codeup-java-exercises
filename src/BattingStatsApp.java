import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/11/17.
 */
public class BattingStatsApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");

        String anotherBatter;
        System.out.println("Welcome to the Batting Statistics App");

        System.out.println("");

        do {
            BattingStatistics batter = new BattingStatistics();

            batter.atBats();
            double sluggingPercentage = batter.sluggingPercentage();
            double battingAverage = batter.battingAverage();

            System.out.println("\nThe batter's batting average is " + df.format(battingAverage) + " and slugging percentage is " + df.format(sluggingPercentage) + ".");

            System.out.println("Another batter?");
            anotherBatter = sc.next();
        } while (anotherBatter.equalsIgnoreCase("yes"));
    }
}
