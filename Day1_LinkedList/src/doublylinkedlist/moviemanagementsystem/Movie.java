package doublylinkedlist.moviemanagementsystem;

// Creating class Name as Movie
public class Movie {
    // Attributes
    String title;
    String director;
    int yearOfRelease;
    double rating;
    Movie prev;
    Movie next;

    // Creating Constructor
    public Movie(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
