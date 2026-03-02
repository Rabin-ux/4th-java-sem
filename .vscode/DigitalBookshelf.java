import java.util.*;
class Book {
    String isbn;
    String title;
    String author;
    boolean isAvailable;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void display() {
        System.out.println("ISBN: " + isbn +
                ", Title: " + title +
                ", Author: " + author +
                ", Available: " + isAvailable);
    }
}

class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                if (book.isAvailable) {
                    book.isAvailable = false;
                    System.out.println("Success! Book borrowed.");
                } else {
                    System.out.println("Sorry, this book is currently checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.isbn.equals(isbn)) {
                book.isAvailable = true;
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable) {
                book.display();
            }
        }
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.display();
        }
    }
}

public class DigitalBookshelf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        library.addBook(new Book("978-31", "Java", "Robin "));
        library.addBook(new Book("978-22", "Operating Systems", "Salamander"));
        library.addBook(new Book("978-13", "Data Structures", "Yash"));

        while (true) {
            System.out.println("\n1. View All Books");
            System.out.println("2. Borrow Book");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;

                case 2:
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    library.borrowBook(isbn);
                    break;

                case 3:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}