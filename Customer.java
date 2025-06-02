/*
Eduardo, Pratyush, Maheen
CS221
Movie Collector System Project
class Customer with watchLater object
 */

public class Customer {
    private String name, email, password;
    private WatchLater watchLater = new WatchLater();

    //constructor for initialization
    public Customer(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //searchMovie() - provides movies when searched by title
    public Movie searchMovie(String title) {
        return EliteSearch.searchByTitle(title);
    }

    //addToWatchLater() - adds movie to watch later
    public void addToWatchLater(Movie movie) {
        watchLater.addMovie(movie);
    }

    //rateMovie() - gives ability to rate movies
    public void rateMovie(Movie movie, int rating) {
        movie.setRating(rating);
    }

    //getWatchLater()
    public WatchLater getWatchLater() {
        return watchLater;
    }
}