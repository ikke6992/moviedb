package nl.torpedo.moviedb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Seeder implements CommandLineRunner {

    private final MovieRepository movieRepository;
    private final ReviewRepository reviewRepository;

    private final Movie ts3 = new Movie("Toy Story 3", "Cry your heart out");

    private final Movie lotr1 = new Movie("The Lord of the Rings: The FellowShip of the Ring", "EPIIIIIIIIIIIIIIIC!");
    private final Movie lotr2 = new Movie("The Lord of the Rings: The Two Towers", "EPIIIIIIIIIIIIIIIC!");
    private final Movie lotr3 = new Movie("The Lord of the Rings: The Return of the King", "EPIIIIIIIIIIIIIIIC!");

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
        movieRepository.save(lotr1);
        movieRepository.save(lotr2);
        movieRepository.save(lotr3);
    }

    public void seedReviews() {

        reviewRepository.save(new Review(ts3, 5, "Fantastisch!"));
        reviewRepository.save(new Review(lotr3, 5, "EPIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIC!"));
    }
}
