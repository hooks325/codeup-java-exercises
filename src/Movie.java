import java.util.*;

/**
 * Created by nedwaldie on 1/17/17.
 */
public class Movie {
    private String title;
    private String category;

    public Movie(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public static String getGenreFromNumber(int x) {
        String o;
        switch (x) {
            case 1:
                o = "Drama";
                break;
            case 2:
                o = "Comedy";
                break;
            case 3:
                o = "Horror";
                break;
            case 4:
                o = "Animated";
                break;
            case 5:
                o = "Musical";
                break;
            case 6:
                o = "Scifi";
                break;
            default:
                o = "";
                break;
        }
        return o;
    }

    public static List sortedMovies(int x, List<Movie> movies) {
        List<Movie> sortedMovies = new ArrayList();
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).category.equalsIgnoreCase(getGenreFromNumber(x))) {
                sortedMovies.add(movies.get(i));
            }
        }
        return sortedMovies;
    }
}
