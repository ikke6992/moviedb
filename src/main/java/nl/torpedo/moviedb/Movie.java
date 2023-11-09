package nl.torpedo.moviedb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Movie {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "movie")
    private Set<Review> reviews;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void addReview(Review review) {
        reviews.add(review);
    }

    public double getRating() {
        double rating = 0;
        int counter = 0;
        for (Review review : reviews) {
            rating += review.getStars();
            counter++;
        }
        return counter == 0 ? -1 : rating / counter;
    }

    public Movie(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Movie() {
    }
}
