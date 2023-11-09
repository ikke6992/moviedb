package nl.torpedo.moviedb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private double stars;
    private String critique;

    @ManyToOne
    private Movie movie;

    Review() {
    }

    public Review(Movie movie, double stars, String critique) {
        this.movie = movie;
        this.stars = stars;
        this.critique = critique;
    }

    public double getStars() {
        return stars;
    }

    public String getCritique() {
        return critique;
    }




}
