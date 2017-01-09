import javax.net.ssl.SSLServerSocket;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/9/17.
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstName = getString("First name: ");
        String lastName = getString("Last name: ");
        int age = getInt("Enter student's age: ");

        students student = new students(firstName, lastName, age);
        System.out.println("Hello, " + student.studentFirstName + " " + student.studentLastName + ".");
        System.out.println("I see that you are " + student.studentAge + ".");
    }

    private static int getInt(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt);
        int userInteger;

        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input must be a number!");
            return getInt(prompt);
        }

        return userInteger;
    }

    public static String getString(String prompt) {
        Scanner scan = new Scanner(System.in);
        String inputString;

        System.out.println(prompt);

        try {
            inputString = scan.nextLine();
        } catch (Exception e) {
            System.out.println("Something went wrong...");
            return getString(prompt);
        }

        return inputString;
    }
}
