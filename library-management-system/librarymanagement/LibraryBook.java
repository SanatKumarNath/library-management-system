package librarymanagement;


/**
 * LibraryBook class represents a book in the library management system.
 * Manages book information, availability, and rental operations.
 */

public class LibraryBook {

    // Book properties
    int bookId;
    String title;
    String author;
    String category;
    int availableCopies;
    int totalCopies;
    double pricePerDay;


    //Constructor to initialize a LibraryBook object
    public LibraryBook(int bookId, String title, String author, String category, int availableCopies,int totalCopies, double pricePerDay) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.availableCopies = availableCopies;
        this.totalCopies=totalCopies;
        this.pricePerDay = pricePerDay;
    }


    //Displays all information about the book
    public void display(){
        System.out.println("Book id "+bookId);
        System.out.println("Title "+title);
        System.out.println("Author "+author);
        System.out.println("Category "+category);
        System.out.println("Available copies "+availableCopies);
        System.out.println("Total copies "+totalCopies);
        System.out.println("Price per day "+pricePerDay);
    }


    //Attempts to borrow copies of this book
    public boolean borrowBook(int copies){
        if (availableCopies>=copies){
            availableCopies=availableCopies-copies;
            return true;
        }else
            return false;
    }


    // Attempts to return copies of this book
    public boolean returnBook(int copies){
        if (availableCopies+copies <= totalCopies){
            availableCopies=availableCopies+copies;
            return true;
        }else
            return false;

    }

    //Calculates the total rental cost for specified days and copies
    public double  calculateRentalCost(int days,int copies){
        double cost = pricePerDay*days*copies;
        return cost;
    }
}
