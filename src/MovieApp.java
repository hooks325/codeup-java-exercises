import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by nedwaldie on 1/17/17.
 */
public class MovieApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validator = new Validator(scan);
        List<Movie> movies = new ArrayList<Movie>();
        List<Movie> sortedMovies = new ArrayList();
        Movie newMovie;

        int category;
        String wantToContinue;

        System.out.println("      ___         ___                              ___                   ___         ___      ___   \n" +
                "     /__/\\       /  /\\        ___      ___        /  /\\                 /  /\\       /  /\\    /  /\\  \n" +
                "    |  |::\\     /  /::\\      /__/\\    /  /\\      /  /:/_               /  /::\\     /  /::\\  /  /::\\ \n" +
                "    |  |:|:\\   /  /:/\\:\\     \\  \\:\\  /  /:/     /  /:/ /\\             /  /:/\\:\\   /  /:/\\:\\/  /:/\\:\\\n" +
                "  __|__|:|\\:\\ /  /:/  \\:\\     \\  \\:\\/__/::\\    /  /:/ /:/_           /  /:/~/::\\ /  /:/~/:/  /:/~/:/\n" +
                " /__/::::| \\:/__/:/ \\__\\:\\___  \\__\\:\\__\\/\\:\\__/__/:/ /:/ /\\         /__/:/ /:/\\:/__/:/ /:/__/:/ /:/ \n" +
                " \\  \\:\\~~\\__\\\\  \\:\\ /  /:/__/\\ |  |:|  \\  \\:\\/\\  \\:\\/:/ /:/         \\  \\:\\/:/__\\\\  \\:\\/:/\\  \\:\\/:/  \n" +
                "  \\  \\:\\      \\  \\:\\  /:/\\  \\:\\|  |:|   \\__\\::/\\  \\::/ /:/           \\  \\::/     \\  \\::/  \\  \\::/   \n" +
                "   \\  \\:\\      \\  \\:\\/:/  \\  \\:\\__|:|   /__/:/  \\  \\:\\/:/             \\  \\:\\      \\  \\:\\   \\  \\:\\   \n" +
                "    \\  \\:\\      \\  \\::/    \\__\\::::/    \\__\\/    \\  \\::/               \\  \\:\\      \\  \\:\\   \\  \\:\\  \n" +
                "     \\__\\/       \\__\\/         ~~~~               \\__\\/                 \\__\\/       \\__\\/    \\__\\/  ");

        for (int i = 1; i <= 100; i++) {
            newMovie = MovieIO.getMovie(i);
            movies.add(newMovie);
        }

        do {
            System.out.println("-------------------------------------------------");
            System.out.println("Choose a category you want to sort the movies by:");
            System.out.println("-------------------------------------------------");
            category = validator.getIntWithinRange("1. Drama \n2. Comedy \n3. Horror  \n4. Animated \n5. Musical \n6. Sci-fi ", 1, 6);

            sortedMovies = Movie.sortedMovies(category, movies);

            System.out.println("\nThere are " + sortedMovies.size() + " movies is the " + Movie.getGenreFromNumber(category) + " category.");
            System.out.println("\nHere is the List of " + Movie.getGenreFromNumber(category) + " movies.");
            System.out.println("-------------------------------------------------");
            for (Movie sortedMovie : sortedMovies) {
                System.out.println(sortedMovie.getTitle());
            }
            System.out.println("-------------------------------------------------\n");

            wantToContinue = validator.getString("Do you want to continue? ");
        } while (wantToContinue.equalsIgnoreCase("yes"));
    }
}
