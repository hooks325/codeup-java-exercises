import java.util.Random;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/18/17.
 */
public class CPUPlayer extends Player {

    public static String cpuChoice() {
        Random rand = new Random();
        int index = rand.nextInt(3);
        return Roshambo.values()[index].toString();
    }


}
