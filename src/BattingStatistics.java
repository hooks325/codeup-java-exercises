import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/11/17.
 */
public class BattingStatistics {
    private int[] atBats = new int[getNumberOfBats()];


    public int getNumberOfBats() {
        Scanner sc = new Scanner(System.in);

        int numberOfBats;
        System.out.println("Enter number of at bats: ");
        try {
            numberOfBats = sc.nextInt();
        } catch (InputMismatchException e) {
            sc.next();
            System.out.println("Input must be an integer\n");
            return getNumberOfBats();
        }
        return numberOfBats;
    }

    public int[] atBats() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < atBats.length; i++) {
            System.out.println("Enter the number of bases earned for at bat number " + (i + 1) + ".");

            try {
                atBats[i] = sc.nextInt();
                if(atBats[i] < 0 || atBats[i] > 4) {
                    throw new IllegalArgumentException("Your input must be an integer between 0 and 4\n");
                }
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input must be an integer\n");
                atBats();
            }catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return atBats();
            }
        }
        return atBats;
    }

    public double sluggingPercentage() {
        double slugging = 0;
        for (int i = 0; i < atBats.length; i++) {
            slugging += atBats[i];
        }

        return slugging / ((double) atBats.length);
    }

    public double battingAverage() {
        int hit = 0;
        for (int i = 0; i < atBats.length; i++) {
            if (this.atBats[i] > 0) {
                hit++;
            }
        }
        return hit / ((double) atBats.length);
    }
}
