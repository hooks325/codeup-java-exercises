import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/6/17.
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person personOne = new Person();
        Person personTwo = new Person();
        Person personThree = new Person();

        newPerson(sc, personOne);
        newPerson(sc, personTwo);
        newPerson(sc, personThree);
    }

    public static void newPerson(Scanner sc, Person person){
        System.out.println("Enter your first name: ");
        person.firstName = sc.next();

        System.out.println("Enter your last name: ");
        person.lastName = sc.next();

        System.out.println("Enter your email address: ");
        person.email = sc.next();

        System.out.println("Hello " + person.firstName + " " + person.lastName + ", we have your email as " + person.email + "\n");

    }
}
