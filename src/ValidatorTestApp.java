import java.util.Scanner;

/**
 * Created by nedwaldie on 1/10/17.
 */
public class ValidatorTestApp {
    public static void main(String[] args) {

        // create a new scanner object
        Scanner scan = new Scanner(System.in);

        // create a validator object
        Validator validator = new Validator(scan);

        int userInt;
        userInt = validator.getInt("Please input any integer.");
        System.out.println("You entered " + userInt);

        int userIntWithinRange = validator.getIntWithinRange("Provide an integer between 0 and 100", 0, 100);
        System.out.println("You entered " + userIntWithinRange);


    }
}
