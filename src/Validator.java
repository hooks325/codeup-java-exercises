import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/10/17.
 */
public class Validator {

        private Scanner scan;

        public Validator(Scanner scan) {
            this.scan = scan;
        }

        public int getInt(String prompt) {
            System.out.println(prompt);
            int userInt;

            try {
                userInt = scan.nextInt();
            } catch(InputMismatchException e) {
                scan.next();
                System.out.println("Input must be an integer");
                return getInt(prompt);
            }

            return userInt;
        }
        public String getString(String prompt) {
            System.out.print(prompt);
            String userString;

            try {
                userString = scan.next();
            } catch(IllegalStateException e) {
                scan.next();
                System.out.println("");
                return getString(prompt);
            }

            return userString;
        }

        public double getDouble(String prompt) {
            System.out.print(prompt);
            double userDouble;

            try {
                userDouble = scan.nextDouble();
            } catch(InputMismatchException e) {
                scan.next();
                System.out.println("Input must be an integer");
                return getInt(prompt);
            }

            return userDouble;
        }

        public int getIntWithinRange(String prompt, int min, int max) {
            int userInt = getInt(prompt);

            try {
                if(userInt < min || userInt > max) {
                    throw new IllegalArgumentException("Your input must be an integer between " + min + " and " + max);
                }
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return getIntWithinRange(prompt, min, max);
            }

            return userInt;
        }

}
