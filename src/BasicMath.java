import java.util.Scanner;

/**
 * Created by nedwaldie on 1/5/17.
 */
public class BasicMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userOperator;
        String moreMath;
        double userFirstNumber;
        double userSecondNumber;

        do {
            System.out.println("Enter first number");
            userFirstNumber = sc.nextDouble();

            // Stops from skipping next user input
            sc.nextLine();

            System.out.println("Select your operator. (add, subtract, multiply, divide)");
            userOperator = sc.nextLine();

            System.out.println("Enter second number");
            userSecondNumber = sc.nextDouble();

            switch (userOperator) {
                case "add":
                    //run add function
                    add(userFirstNumber, userSecondNumber, userOperator);
                    break;
                case "subtract":
                    //run subtract function
                    subtract(userFirstNumber, userSecondNumber, userOperator);
                    break;
                case "multiply":
                    multiply(userFirstNumber, userSecondNumber, userOperator);
                    //run multiply function
                    break;
                case "divide":
                    //run divide
                    divide(userFirstNumber, userSecondNumber, userOperator);
                    break;
            }
            System.out.println("Do you want to do more math? ");
            moreMath = sc.next();

        } while (moreMath.equals("yes"));
    }

    public static void add(double userFirstNumber, double userSecondNumber, String userOperator) {
        double answer = userFirstNumber + userSecondNumber;
        userOperator = "plus";
        displayAnswer(userFirstNumber, userSecondNumber, userOperator, answer);
    }

    public  static void subtract(double userFirstNumber, double userSecondNumber, String userOperator) {
        double answer = userFirstNumber - userSecondNumber;
        userOperator = "minus";
        displayAnswer(userFirstNumber, userSecondNumber, userOperator, answer);
    }

    public  static void multiply(double userFirstNumber, double userSecondNumber, String userOperator) {
        double answer = userFirstNumber * userSecondNumber;
        userOperator = "times";
        displayAnswer(userFirstNumber, userSecondNumber, userOperator, answer);
    }

    public  static void divide(double userFirstNumber, double userSecondNumber, String userOperator) {
        double answer =  userFirstNumber / userSecondNumber;
        userOperator = "divided by";
        displayAnswer(userFirstNumber, userSecondNumber, userOperator, answer);
    }

    public static void displayAnswer (double userFirstNumber, double userSecondNumber, String userOperator, double answer){
        System.out.println(userFirstNumber + " " + userOperator + " " + userSecondNumber + " = " + answer);
    }
}
