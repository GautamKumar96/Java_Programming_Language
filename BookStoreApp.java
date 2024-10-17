import java.util.ArrayList;
import java.util.Scanner;

// Book class to hold information about a book
class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

// BookStore class to manage the collection of books
class BookStore {
    private ArrayList<Book> inventory = new ArrayList<>(); // To store books

    // Method to add a book to the inventory
    public void addBook(String title, String author, double price) {
        Book newBook = new Book(title, author, price);
        inventory.add(newBook);
        System.out.println("Book added successfully!");
    }

    // Method to display all books
    public void displayBooks() {
        if (inventory.isEmpty()) {
            System.out.println("No books available in the store.");
        } else {
            System.out.println("Books available in the store:");
            for (Book book : inventory) {
                book.displayBook();
            }
        }
    }

    // Method to search books by title
    public void searchByTitle(String title) {
        boolean found = false;
        for (Book book : inventory) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                book.displayBook();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No book found with the title: " + title);
        }
    }

    // Method to search books by author
    public void searchByAuthor(String author) {
        boolean found = false;
        for (Book book : inventory) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Books by " + author + ":");
                book.displayBook();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by the author: " + author);
        }
    }
}

// Main class to run the BookStore
public class BookStoreApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore store = new BookStore();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the Book Store");
            System.out.println("1. Add a Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book price: ");
                    double price = scanner.nextDouble();
                    store.addBook(title, author, price);
                    break;
                case 2:
                    store.displayBooks();
                    break;
                case 3:
                    System.out.print("Enter the title to search: ");
                    String searchTitle = scanner.nextLine();
                    store.searchByTitle(searchTitle);
                    break;
                case 4:
                    System.out.print("Enter the author to search: ");
                    String searchAuthor = scanner.nextLine();
                    store.searchByAuthor(searchAuthor);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Thank you for visiting the Book Store!");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}
