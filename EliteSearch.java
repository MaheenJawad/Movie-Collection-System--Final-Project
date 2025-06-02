/*
Eduardo, Pratyush, Maheen
CS221
Movie Collector System Project
class EliteSearch with movie registry
 */

//package
import java.util.ArrayList;

public class EliteSearch {
    //prep movie register
    private static ArrayList<Movie> movieRegistry = new ArrayList<>();

    //register() - adds movie to the registry of movies
    public static void register(Movie m) {
        movieRegistry.add(m);
    }

    public static Movie searchByTitle(String title) {
        for (Movie m : movieRegistry) {
            if (m.title.equalsIgnoreCase(title)) return m;
        }
        return null;
    }
}