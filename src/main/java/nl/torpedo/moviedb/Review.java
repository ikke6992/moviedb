package nl.torpedo.moviedb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue
    private long id;
    private int stars;
    private String critique;

    Review() {
    }

    public Review(int stars, String critique) {
        this.stars = stars;
        this.critique = critique;
    }



    public int getStars() {
        return stars;
    }

    public String getCritique() {
        return critique;
    }




}
