package doublylinkedlist.liberarymanagementsystem;

public class LibraryManagementSystem {
     Book head;
     Book tail;

     // Creating Constructor
     public LibraryManagementSystem() {
         this.head = null;
         this.tail = null;
     }

    // Add a new book at the beginning
    public void addBookAtBeginning(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = newBook;
            tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add a new book at the end
    public void addBookAtEnd(String title, String author, String genre, int bookID, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (head == null) {
            head = newBook;
            tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add a new book at a specific position
    public void addBookAtPosition(String title, String author, String genre, int bookID, boolean isAvailable, int position) {
        Book newBook = new Book(title, author, genre, bookID, isAvailable);
        if (position == 1) {
            addBookAtBeginning(title, author, genre, bookID, isAvailable);
            return;
        }
        Book temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newBook.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            newBook.prev = temp;
            if (newBook.next == null) {
                tail = newBook;
            }
        }
    }
    // Remove a book by Book ID
    public void removeBookByID(int bookID) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Book not found");
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
    public void searchBookByTitle(String title) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equals(title)) {
                System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookID + ", Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No books found with title " + title);
        }
    }

    // Search for a book by Author
    public void searchBookByAuthor(String author) {
        Book temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equals(author)) {
                System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookID + ", Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
                found = true;
            }
            temp = temp.next;
        }
        if (!found) {
            System.out.println("No books found by author " + author);
        }
    }
    // Update a book’s Availability Status
    public void updateBookAvailability(int bookID, boolean isAvailable) {
        Book temp = head;
        while (temp != null && temp.bookID != bookID) {
            temp = temp.next;
        }
        if (temp != null) {
            temp.isAvailable = isAvailable;
        } else {
            System.out.println("Book not found");
        }
    }

    // Display all books in forward order
    public void displayBooksForward() {
        Book temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookID + ", Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.next;
        }
    }
    // Display all books in reverse order
    public void displayBooksReverse() {
        Book temp = tail;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Author: " + temp.author + ", Genre: " + temp.genre + ", Book ID: " + temp.bookID + ", Availability: " + (temp.isAvailable ? "Available" : "Not Available"));
            temp = temp.prev;
        }
    }
    // Count the total number of books in the library
    public int countTotalBooks() {
        Book temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Creating Main Method
    public static void main(String[] args) {
        LibraryManagementSystem ob = new LibraryManagementSystem();
        ob.addBookAtBeginning("Book1", "Author1", "Genre1", 1, true);
        ob.addBookAtEnd("Book2", "Author2", "Genre2", 2, true);
        ob.addBookAtPosition("Book3", "Author3", "Genre3", 3, true, 2);


        ob.displayBooksForward();


        ob.displayBooksReverse();


        ob.searchBookByAuthor("Author2");


        ob.updateBookAvailability(3, false);


        ob.displayBooksForward();


        ob.removeBookByID(1);
        ob.displayBooksForward();

        System.out.println("Total number of books in the library: " + ob.countTotalBooks());
    }

}
