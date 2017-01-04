import java.util.Scanner;

/**
 * Created by nedwaldie on 1/4/17.
 */
public class loopDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String anotherGrade;
        String anotherInt;
        String anotherFizz;
        int fizzBuzzStart;
        int fizzBuzzEnd;
        int i = 5;
        int n = 100;
        long squared = 2;
        int userInput;
        int numericalGrade;
        int square;
        int cube;

        // While loop
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        System.out.println("--------------------------------------------------");

        // Do while loop
        do {
            System.out.println(n);
            n -= 5;
        } while (n >= -10);

        System.out.println("--------------------------------------------------");

        do {
            System.out.println(squared);
            squared *= squared;
        } while (squared <= 1000000);

        System.out.println("--------------------------------------------------");

        // For Loop
        for (long number = 100; number >= -10; number -= 5) {
            System.out.println(number);
        }

        System.out.println("--------------------------------------------------");

        for (long s = 2; s <= 1000000; s *= s) {
            System.out.println(s);
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Welcome to FizzBuzz!!!");
        do {
            System.out.println("Enter a starting number: ");
            fizzBuzzStart = sc.nextInt();

            System.out.println("Enter a ending number");
            fizzBuzzEnd = sc.nextInt();


            for (int f = fizzBuzzStart; f <= fizzBuzzEnd; f++) {
                if (f % 3 == 0 && f % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if ((f % 3) == 0) {
                    System.out.println("Fizz");
                } else if ((f % 5) == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(f);
                }
            }

            sc.nextLine();

            System.out.println("Do you want to play FizzBuzz again? ");
            anotherFizz = sc.nextLine();
        } while (anotherFizz.equalsIgnoreCase("yes"));

        System.out.println("--------------------------------------------------");

        do {
            System.out.println("Please enter an integer: ");
            userInput = sc.nextInt();

            System.out.println("\nNumber      | Square      | Cube");
            System.out.println("------------------------------------");
            for (int startingNumber = 1; startingNumber <= userInput; startingNumber++) {
                square = startingNumber * startingNumber;
                cube = startingNumber * startingNumber * startingNumber;
                System.out.printf("%10s %12s %12s", startingNumber, square, cube);
                System.out.println();
            }

            // Stop from skipping the next question
            sc.nextLine();

            System.out.println("\nDo you want to enter a different number? ");
            anotherInt = sc.nextLine();
        } while (anotherInt.equalsIgnoreCase("yes"));

        System.out.println("--------------------------------------------------");

        do {
            System.out.println("Please Enter a numerical grade: ");
            numericalGrade = sc.nextInt();
            if (numericalGrade >= 88) {
                System.out.println("A");
            } else if (numericalGrade >= 80) {
                System.out.println("B");
            } else if (numericalGrade >= 67) {
                System.out.println("C");
            } else if (numericalGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }

            // Stop from skipping the next question
            sc.nextLine();

            System.out.println("Do you want to enter another grade? ");
            anotherGrade = sc.nextLine();
        } while (anotherGrade.equalsIgnoreCase("yes"));
    }
}
