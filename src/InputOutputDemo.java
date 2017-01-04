import java.util.Scanner;

/**
 * Created by nedwaldie on 1/3/17.
 */
public class InputOutputDemo {
    public static void main(String[] args) {
        String userSentence;
        String firstWord;
        String secondWord;
        String thirdWord;
        String anotherClass;
        int userInput;
        double length;
        double width;
        double height;
        double perimeter;
        double area;
        double volume;



        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        userInput = sc.nextInt();
        System.out.println(userInput);

        // This stops the program from skipping the user input for userSentence
        sc.nextLine();

        System.out.println("Please enter a sentence: ");
        userSentence = sc.nextLine();
        System.out.println(userSentence);

        System.out.println("Please enter your first word: ");
        firstWord = sc.next();
        System.out.println(firstWord);

        System.out.println("Please enter your second word: ");
        secondWord = sc.next();
        System.out.println(secondWord);

        System.out.println("Please enter your third word: ");
        thirdWord = sc.next();
        System.out.println(thirdWord);

        // Calculating the area and perimeter of the classroom.
        do {
            System.out.println("Please enter the length of the classroom: ");
            length = sc.nextDouble();

            System.out.println("Please enter the width of the classroom: ");
            width = sc.nextDouble();

            System.out.println("Please enter the height of the classroom: ");
            height = sc.nextDouble();

            area = length * width;
            perimeter = length + width;
            volume = length * width * height;

            System.out.println("The Perimeter is " + perimeter);
            System.out.println("The Area is " + area);
            System.out.println("The Volume is " + volume);

            // This stops the program from skipping the user input for anotherClass
            sc.nextLine();

            System.out.println("Do you want to measure another classroom? (yes or no)");
            anotherClass = sc.nextLine();
        } while (anotherClass.equals("yes"));
    }
}
