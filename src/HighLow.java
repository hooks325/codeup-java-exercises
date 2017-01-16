/**
 * Created by nedwaldie on 1/12/17.
 */
public class HighLow {
    double computerNumber = getComputerNumber();
    double userNumber;
    int numberOfGuesses = 0;



    public double getComputerNumber(){
        return Math.floor(Math.random() * 100) + 1;
    }

    public String compareNumbers(double userNumber, double computerNumber, int numberOfGuesses) {
         if (userNumber > computerNumber && numberOfGuesses < 5) {
                return "LOWER!";
            } else if (userNumber < computerNumber && numberOfGuesses < 5) {
                return "HIGHER!";
            } else if (userNumber == computerNumber && numberOfGuesses <= 5) {
                this.numberOfGuesses = 5;
                return "\nGOOD GUESS! YOU WIN....FOR NOW!";
            } else {
                return "\nGAME OVER! YOU LOSE!";
            }
}
}
