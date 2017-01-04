import java.util.Scanner;

/**
 * Created by nedwaldie on 1/3/17.
 */
public class HelloWorld {
    public static void main(String[] args) {

        String userInput = "Bob";

        Scanner sc = new Scanner(System.in);

        System.out.println(userInput);
        System.out.println("Enter name: ");
        userInput = sc.nextLine();

        System.out.println("Your name is " + userInput);




//        System.out.println("Hello, World!");
//        System.out.print("All java code lives in classes. ");
//        System.out.println("Goodbye, World!");
    }
}
