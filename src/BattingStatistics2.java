/**
 * Created by nedwaldie on 1/11/17.
 */
public class BattingStatistics2 {
    int[] timesAtBat;
    int numberOfBats;
    int hits = 0;
    int totalBases = 0;
    double sluggingPercentage;
    double battingAverage;

    public double getSluggingPercentage(int numberOfBats, int totalBases) {
        double sluggingPercentage = (double) totalBases / numberOfBats;
        return sluggingPercentage;
    }

    public double getBattingAverage(int numberOfBats, int hits) {
        double battingAverage = (double) hits / numberOfBats;
        return battingAverage;
    }
}
