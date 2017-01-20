/**
 * Created by nedwaldie on 1/19/17.
 */
public enum Roshambo {
    ROCK ("Rock"),
    PAPER ("Paper"),
    SCISSORS ("Scissors");

    private final String option;

    private Roshambo(String s) {
        option = s;
    }

    public String toString() {
        return this.option;
    }
}
