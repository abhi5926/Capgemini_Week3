package doublylinkedlist.moviemanagementsystem;

public class MovieManagement {
     Movie head;
     Movie tail;

     // Creating Constructor
     public MovieManagement() {
         this.head = null;
         this.tail = null;
     }

    // Add a movie record at the beginning
    public void addMovieAtBeginning(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }

    // Add a movie record at the end
    public void addMovieAtEnd(String title, String director, int yearOfRelease, double rating) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (head == null) {
            head = newMovie;
            tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    // Add a movie record at a specific position
    public void addMovieAtPosition(String title, String director, int yearOfRelease, double rating, int position) {
        Movie newMovie = new Movie(title, director, yearOfRelease, rating);
        if (position == 1) {
            addMovieAtBeginning(title, director, yearOfRelease, rating);
            return;
        }
        Movie temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newMovie.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newMovie;
            }
            temp.next = newMovie;
            newMovie.prev = temp;
            if (newMovie.next == null) {
                tail = newMovie;
            }
        }
    }

    // Remove a movie record by Movie Title
    public void removeMovieByTitle(String title) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Movie not found");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        } else {
            tail = temp.prev;
        }
    }

    // Search for a movie record by Director
    public void searchMovieByDirector(String director) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equals(director)) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year of Release: " + temp.yearOfRelease + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found directed by " + director);
        }
    }

    // Search for a movie record by Rating
    public void searchMovieByRating(double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year of Release: " + temp.yearOfRelease + ", Rating: " + temp.rating);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No movies found with rating " + rating);
        }
    }

    // Display all movie records in forward order
    public void displayMoviesForward() {
        Movie temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year of Release: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }

    // Display all movie records in reverse order
    public void displayMoviesReverse() {
        Movie temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year of Release: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.prev;
        }
    }
    // Update a movie's Rating based on the Movie Title
    public void updateMovieRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null && !temp.title.equals(title)) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.rating = newRating;
        } else {
            System.out.println("Movie not found");
        }
    }

    // Creating Main Method
    public static void main(String[] args) {
        MovieManagement ob = new MovieManagement();
        ob.addMovieAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        ob.addMovieAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        ob.addMovieAtPosition("The Dark Knight", "Christopher Nolan", 2008, 9.0, 2);


        ob.displayMoviesForward();


        ob.displayMoviesReverse();


        ob.searchMovieByDirector("Christopher Nolan");


        ob.searchMovieByRating(8.8);


        ob.updateMovieRating("Interstellar", 9.0);


        ob.displayMoviesForward();


        ob.removeMovieByTitle("Inception");
        ob.displayMoviesForward();
    }
}


