import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/11/17.
 */
public class BattingStatsApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        Validator validate = new Validator(sc);
        BattingStatistics2 batter = new BattingStatistics2();

        batter.numberOfBats = validate.getInt("Enter number of bats:");

        batter.timesAtBat = new int[batter.numberOfBats];

        for (int i = 0; i < batter.timesAtBat.length; i++) {
            batter.timesAtBat[i] = validate.getIntWithinRange("Enter number of bases for at bat number " + (i + 1) + ": ", 0, 4);

            if (batter.timesAtBat[i] > 0) {
                batter.hits++;
            }
            batter.totalBases += batter.timesAtBat[i];
        }

        System.out.println("The batter's batting average is " + df.format(batter.getBattingAverage(batter.numberOfBats, batter.hits)));
        System.out.println("The batter's slugging percentage is " + df.format(batter.getSluggingPercentage(batter.numberOfBats, batter.totalBases)));


    }
}
