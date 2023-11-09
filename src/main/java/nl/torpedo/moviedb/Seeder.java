package nl.torpedo.moviedb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final ReviewRepository reviewRepository;

    public Seeder(MovieRepository movieRepository, ReviewRepository reviewRepository) {
        this.movieRepository = movieRepository;
        this.reviewRepository = reviewRepository;
    }

    public void run(String... args) {
        seedMovies();
        seedReviews();
    }

    public void seedMovies() {
        movieRepository.save(new Movie("Toy Story 3", "Cry your heart out"));
        movieRepository.save(new Movie("The Lord of the Rings: Return of the King", "EPIIIIIIIIIIIIIIIC!"));
    }

    public void seedReviews() {

    }
}
