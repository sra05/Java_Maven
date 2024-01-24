package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie {
    private int yearReleased;
    private double rating;
    private double budget;
    private double collectionAmount;

    public Movie(int yearReleased, double rating, double budget, double collectionAmount) {
        this.yearReleased = yearReleased;
        this.rating = rating;
        this.budget = budget;
        this.collectionAmount = collectionAmount;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public double getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public double getCollectionAmount() {
        return collectionAmount;
    }
}

public class MovieComparatorExample {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(2005, 8.2, 50000000, 150000000));
        movies.add(new Movie(2010, 7.5, 70000000, 180000000));
        movies.add(new Movie(2015, 8.7, 80000000, 250000000));
        movies.add(new Movie(2010, 8.0, 60000000, 170000000));

        // Sorting by rating and profit
        Collections.sort(movies, Comparator.comparing(Movie::getRating)
                .thenComparing(Comparator.comparing(Movie::getCollectionAmount).reversed()));

        System.out.println("Sorted by rating and profit:");
        printMovies(movies);

        // Sorting by year released and rating
        Collections.sort(movies, Comparator.comparing(Movie::getYearReleased)
                .thenComparing(Comparator.comparing(Movie::getRating).reversed()));

        System.out.println("\nSorted by year released and rating:");
        printMovies(movies);
    }

    private static void printMovies(List<Movie> movies) {
        for (Movie movie : movies) {
            System.out.println("Year: " + movie.getYearReleased() +
                    ", Rating: " + movie.getRating() +
                    ", Budget: $" + movie.getBudget() +
                    ", Collection: $" + movie.getCollectionAmount());
        }
    }
}
