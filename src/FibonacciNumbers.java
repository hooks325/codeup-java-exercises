import java.util.Scanner;

/**
 * Created by nedwaldie on 1/12/17.
 */
public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Validator validator = new Validator(sc);

        int max;
        int x = 0;
        int y = 1;

        max = validator.getInt("Enter the max number of sequences you want to go up to: ");

        System.out.println(x);
        System.out.println(y);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            x = x + y;
            System.out.println(x);

            y = x + y;
            if (y > max) {
                System.out.println("It took " + i + " number of sequences to reach your max.");
                return;
            }
            System.out.println(y);

        }



    }
}
