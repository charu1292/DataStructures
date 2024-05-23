package String;

import java.util.Arrays;
import java.util.Comparator;


public class MovieSorter {

    public static void main(String[] args) {
        String movies = "Coming to America - 1988 Gladiator - 2000 The Godfather - 1972 O Brother, Where Art Thou? - 2000 Eddie Murphy: Raw - 1987 The Departed - 2006";
        fun(movies);
    }

    static class Movie {
        int year;
        String title;

        public Movie(int year, String title) {
            this.year = year;
            this.title = title;
        }
    }

    public static void fun(String movies) {
        String[] movieArray = movies.split("(?<=\\d{4})\\s(?=[A-Z])"); //splitting with a regexs
        Movie[] finalArray = new Movie[movieArray.length];

        // Populate the array
        for (int i = 0; i < movieArray.length; i++) {
            String movie = movieArray[i];
            int year = Integer.parseInt(movie.substring(movie.lastIndexOf(" ") + 1));
            finalArray[i] = new Movie(year, movie);
        }

        Arrays.sort(finalArray, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                if(o1.year == o2.year) {
                    return o1.title.compareTo(o2.title);
                } else {
                    return o1.year - o2.year;
                }
            }
        });

        // Output the sorted movies
        for (Movie movie : finalArray) {
            System.out.println(movie.title);
        }

    }
}