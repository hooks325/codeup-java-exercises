import java.util.Scanner;

/**
 * Created by nedwaldie on 1/5/17.
 */

public class PigLatinDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String anotherWord;

        do {
            System.out.println("Please enter a word you want to translate to Pig Latin");
            String userWord = sc.next();

            userWord = userWord.toLowerCase();
            int vowelLocation = findVowel(userWord);
            userWord = translatedWord(vowelLocation, userWord);

            System.out.println(userWord);

            // Stop from skipping next input
            sc.nextLine();

            System.out.println("Do you want to translate another word?");
            anotherWord = sc.nextLine();

        } while (anotherWord.equals("yes"));
    }

    public static int findVowel(String userWord) {

        for (int i = 0; i < userWord.length(); i++) {
            char letter = userWord.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                return i;
            }
        }
        return -1;
    }

    public static String translatedWord(int vowelLocation, String userWord) {
        char letter = userWord.charAt(vowelLocation);
        if (vowelLocation < 0 ) {
            return "This word is untranslatable.";
        } else if (vowelLocation == 0) {
            return userWord + letter + "way";
        } else {
            String beginningOfWord = userWord.substring(vowelLocation, userWord.length());
            String endWord = userWord.substring(0, vowelLocation);
            return beginningOfWord + endWord + "ay";
        }
    }
}
