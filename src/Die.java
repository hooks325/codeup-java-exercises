import java.util.Random;

/**
 * Created by nedwaldie on 1/9/17.
 */
public class Die {
    int numberOfsides;
    int currentValue;

    public Die(int numberOfSides) {
        this.numberOfsides = numberOfSides;
    }

    public int roll() {
        currentValue = (int) Math.ceil(Math.random() * numberOfsides);
        return currentValue;
    }

}
