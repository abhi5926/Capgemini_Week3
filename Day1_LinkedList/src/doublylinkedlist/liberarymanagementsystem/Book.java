package doublylinkedlist.liberarymanagementsystem;

// Creating Node class as Book
public class Book {
    // Attributes
    String title;
    String author;
    String genre;
    int bookID;
    boolean isAvailable;
    Book prev;
    Book next;

    // Creating Constructor
    public Book(String title, String author, String genre, int bookID, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.isAvailable = isAvailable;
        this.prev = null;
        this.next = null;
    }
}
