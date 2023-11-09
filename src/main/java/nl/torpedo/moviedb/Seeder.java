package nl.torpedo.moviedb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final ReviewRepository reviewRepository;

    private final Movie ts3 = new Movie("Toy Story 3", "Cry your heart out");
    private final Movie lotr = new Movie("The Lord of the Rings: Return of the King", "EPIIIIIIIIIIIIIIIC!");

    public Seeder(MovieRepository movieRepository, ReviewRepository reviewRepository) {
        this.movieRepository = movieRepository;
        this.reviewRepository = reviewRepository;
    }

    public void run(String... args) {
        seedMovies();
        seedReviews();
    }

    public void seedMovies() {

        movieRepository.save(ts3);
        movieRepository.save(lotr);
    }

    public void seedReviews() {

        reviewRepository.save(new Review(ts3, 5, "Fantastisch!"));
        reviewRepository.save(new Review(lotr, 5, "EPIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIC!"));
    }
}
