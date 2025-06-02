/*
Eduardo, Pratyush, Maheen
CS221
Movie Collector System Project
class FeatureFilm extends class Movie
 */

public class FeatureFilm extends Movie {
    //attributes duration and director
    private int duration;
    private String director;

    //constructor for initialization
    public FeatureFilm(String title, String genre, int releaseYear, float rating, int duration, String director) {
        super(title, genre, releaseYear, rating);
        this.duration = duration;
        this.director = director;
    }

}
