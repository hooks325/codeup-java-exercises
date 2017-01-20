import java.util.Scanner;

/**
 * Created by nedwaldie on 1/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        Circle newCircle;

        String anotherCircle;

        do {
            System.out.println("-------------------------------");
            double radius = validator.getDouble("Enter the radius of a circle: ");

            newCircle = new Circle(radius);
            String circumference = newCircle.formatNumber(newCircle.getCircumference());
            String area = newCircle.formatNumber(newCircle.getArea());

            System.out.println("--------------------------------------------------------------");
            System.out.println("The circumference of a circle with a radius of " + radius + " is " + circumference + ".");
            System.out.println("The area of a circle with a radius of " + radius + " is " + area + ".");
            System.out.println("--------------------------------------------------------------");

            anotherCircle = validator.getString("Do you want to enter another circle? ");
        } while (anotherCircle.equalsIgnoreCase("yes"));


        System.out.println("-------------------------------");
        System.out.println("You created " + Circle.getNumberOfCircles() + " circles.");
        System.out.println("GOODBYE!");
        System.out.println("-------------------------------");



    }
}
