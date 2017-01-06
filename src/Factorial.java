import java.util.Scanner;

/**
 * Created by nedwaldie on 1/5/17.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String anotherNumber;
        int userInteger;
        do {
            System.out.println("Enter an Integer: ");
            userInteger = sc.nextInt();

            long answer = factorial(userInteger);

            System.out.println("The factorial of " + userInteger + " is " + answer + ".");

            System.out.println("Do you want to try another number?");
            anotherNumber = sc.next();
        } while (anotherNumber.equals("yes"));
    }

    public static long factorial(int userInteger) {
        long fact = 1;
        for (int i = 1; i <= userInteger; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
