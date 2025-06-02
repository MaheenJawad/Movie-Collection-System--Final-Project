/*
Eduardo, Pratyush, Maheen
CS221
Movie Collector System Project
class Documentary with constructor and two variables
 */

public class Documentary extends Movie {
    private String subject;
    private String narrator;

    //constructor for initialization - has all possible traits like title, genre, rating, etc.
    public Documentary(String title, String genre, int releaseYear, float rating, String subject, String narrator) {
        super(title, genre, releaseYear, rating);
        this.subject = subject;
        this.narrator = narrator;
    }
}

