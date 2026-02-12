import java.util.ArrayList;
import java.util.List;

// 1. The Book Class
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }
    
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn;
    }
}

// 2. The Library Class
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book.getTitle());
    }

    public Book searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        System.out.println("\n--- Library Inventory ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// 3. The Main Class (Renamed to Mains to match your filename)
public class Mains {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "97807432"));
        myLibrary.addBook(new Book("1984", "George Orwell", "97804515"));
        myLibrary.addBook(new Book("Java Basics", "Rabin", "11223344"));
        myLibrary.displayAllBooks();

        String query = "1984";
        System.out.println("\nSearching for: " + query);
        Book found = myLibrary.searchByTitle(query);

        if (found != null) {
            System.out.println("Found! Details: " + found);
        } else {
            System.out.println("Sorry, book not found.");
        }
    }
}