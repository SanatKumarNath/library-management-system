package librarymanagement;

import java.util.Scanner;

/**
 * Library Management System
 * A console-based application for managing library book inventory,
 * including borrowing, returning, and searching for books.
 */

class Main {
    public static void main(String[] args) {

        // Initialize library inventory with 6 books
        LibraryBook book1=new LibraryBook(1,"The Silent Patient","Alex Michaelides","Fiction",3,5,15);
        LibraryBook book2=new LibraryBook(2,"Sapiens: A Brief History of Humankind","Yuval Noah Harari","History",2,4,20);
        LibraryBook book3=new LibraryBook(3,"Astrophysics for People in a Hurry","Neil deGrasse Tyson","Science",5,6,12);
        LibraryBook book4=new LibraryBook(4,"Educated","Tara Westover","Non-Fiction",4,5,18);
        LibraryBook book5=new LibraryBook(5,"1984","George Orwell","Fiction",6,8,10);
        LibraryBook book6=new LibraryBook(6,"A Brief History of Time","Stephen Hawking","Science",1,3,22);


        // Display initial library inventory
        System.out.println("== LIBRARY INVENTORY ==");
        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();
        book6.display();

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        // Main program loop - continues until user chooses to exit
        while (running) {
            // Display menu options
            System.out.println("==MENU==");
            System.out.println("1. Search books by category");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Calculate rental cost");
            System.out.println("5. Show most popular book (least available copies compared to total)");
            System.out.println("6. Show library statistics");
            System.out.println("7. Exit");


            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();// Clear input buffer

            switch (choice) {
                // Case 1: Search books by category
                case 1:
                    System.out.print("Enter category (Fiction/Science/History/Non-Fiction): ");
                    String category = sc.nextLine();
                    boolean bookfound = false;

                    // Check each book for matching category
                    if (category.equalsIgnoreCase(book1.category)) {
                        book1.display();
                        bookfound = true;
                    }
                    if (category.equalsIgnoreCase(book2.category)) {
                        book2.display();
                        bookfound = true;
                    }
                    if (category.equalsIgnoreCase(book3.category)) {
                        book3.display();
                        bookfound = true;
                    }
                    if (category.equalsIgnoreCase(book4.category)) {
                        book4.display();
                        bookfound = true;
                    }
                    if (category.equalsIgnoreCase(book5.category)) {
                        book5.display();
                        bookfound = true;
                    }
                    if (category.equalsIgnoreCase(book6.category)) {
                        book6.display();
                        bookfound = true;
                    }

                    // Display message if no books found in category
                    if (!bookfound) {
                        System.out.println("Category not found!!");
                    }
                    break;

                // Case 2: Borrow a book
                case 2:
                    System.out.println("Enter book title you want to borrow: ");
                    String borrow = sc.nextLine();
                    System.out.println("How many copies do you want? ");
                    int wantedCopiies = sc.nextInt();
                    sc.nextLine();// Clear buffer

                    // Search for the book by title
                    LibraryBook foundBook = null;

                    if (borrow.equalsIgnoreCase(book1.title)) {
                        foundBook = book1;
                    } else if (borrow.equalsIgnoreCase(book2.title)) {
                        foundBook = book2;
                    } else if (borrow.equalsIgnoreCase(book3.title)) {
                        foundBook = book3;
                    } else if (borrow.equalsIgnoreCase(book4.title)) {
                        foundBook = book4;
                    } else if (borrow.equalsIgnoreCase(book5.title)) {
                        foundBook = book5;
                    } else if (borrow.equalsIgnoreCase(book6.title)) {
                        foundBook = book6;
                    }

                    // Process borrowing request
                    if (foundBook == null) {
                        System.out.println("We dont have the entered book!!");
                    } else {
                        boolean success = foundBook.borrowBook(wantedCopiies);

                        if (success) {
                            System.out.println("Here is your " + wantedCopiies + "books");
                            System.out.println("remaaining books " + foundBook.availableCopies);
                        } else {
                            System.out.println("Not enough books available!!");
                        }
                    }

                    break;


                // Case 3: Return a book
                case 3:
                    System.out.println("Return book selected");
                    System.out.println("Enter book title to return");
                    String returnBook = sc.nextLine();
                    System.out.println("Enter how many copies to return");
                    int returnQuantity = sc.nextInt();
                    sc.nextLine();// Clear buffer

                    // Search for the book by title
                    LibraryBook foundBook1 = null;

                    if (returnBook.equalsIgnoreCase(book1.title)) {
                        foundBook1 = book1;
                    } else if (returnBook.equalsIgnoreCase(book2.title)) {
                        foundBook1 = book2;
                    } else if (returnBook.equalsIgnoreCase(book3.title)) {
                        foundBook1 = book3;
                    } else if (returnBook.equalsIgnoreCase(book4.title)) {
                        foundBook1 = book4;
                    } else if (returnBook.equalsIgnoreCase(book5.title)) {
                        foundBook1 = book5;
                    } else if (returnBook.equalsIgnoreCase(book6.title)) {
                        foundBook1 = book6;
                    }

                    // Process return request
                    if (foundBook1 == null) {
                        System.out.println("This book was not borrowed from here");
                    } else {
                        boolean success = foundBook1.returnBook(returnQuantity);

                        if (success) {
                            System.out.println("Thanks for returning" + foundBook1.title);
                            System.out.println(foundBook1.availableCopies + " books are available ");
                        } else {
                            System.out.println("wrong info");
                        }
                    }

                    break;

                // Case 4: Calculate rental cost
                case 4:
                    System.out.println("Calculating rental cost");
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter number of days: ");
                    int noOfDays = sc.nextInt();
                    System.out.print("Enter number of copies: ");
                    int noOfCopies = sc.nextInt();
                    sc.nextLine();// Clear buffer

                    // Search for the book by title
                    LibraryBook foundBook2 = null;

                    if (title.equalsIgnoreCase(book1.title)) {
                        foundBook2 = book1;
                    } else if (title.equalsIgnoreCase(book2.title)) {
                        foundBook2 = book2;
                    } else if (title.equalsIgnoreCase(book3.title)) {
                        foundBook2 = book3;
                    } else if (title.equalsIgnoreCase(book4.title)) {
                        foundBook2 = book4;
                    } else if (title.equalsIgnoreCase(book5.title)) {
                        foundBook2 = book5;
                    } else if (title.equalsIgnoreCase(book6.title)) {
                        foundBook2 = book6;
                    }

                    // Calculate and display rental cost
                    if (foundBook2 == null) {
                        System.out.println("The entered book is not found");
                    } else {
                        double cost = foundBook2.calculateRentalCost(noOfDays, noOfCopies);
                        System.out.println("Your total cost will be " + cost);
                    }

                    break;


                // Case 5: Show most popular book (lowest available/total ratio)
                case 5:
                    System.out.println("Showing most popular book");

                    // Start with book1 as most popular
                    LibraryBook mostPopular = book1;
                    double lowestRatio = (double) book1.availableCopies/book1.totalCopies;

                    // Compare with book2
                    double ratio2 = (double) book2.availableCopies/book2.totalCopies;
                    if (ratio2<lowestRatio){
                        mostPopular = book2;
                        lowestRatio = ratio2;
                    }

                    // Compare with book3
                    double ratio3 = (double) book3.availableCopies/book3.totalCopies;
                    if (ratio3<lowestRatio){
                        mostPopular = book3;
                        lowestRatio = ratio3;
                    }

                    // Compare with book4
                    double ratio4 = (double) book4.availableCopies/book4.totalCopies;
                    if (ratio4<lowestRatio){
                        mostPopular = book4;
                        lowestRatio = ratio4;
                    }

                    // Compare with book5
                    double ratio5 = (double) book5.availableCopies/book5.totalCopies;
                    if (ratio5<lowestRatio){
                        mostPopular = book5;
                        lowestRatio = ratio5;
                    }

                    // Compare with book6
                    double ratio6 = (double) book6.availableCopies/book6.totalCopies;
                    if (ratio6<lowestRatio){
                        mostPopular = book6;
                        lowestRatio = ratio6;
                    }

                    // Display result
                    System.out.println("Most popular book: " + mostPopular.title);
                    System.out.println("Borrowed: " + (mostPopular.totalCopies - mostPopular.availableCopies) + "/" + mostPopular.totalCopies);
                    break;

                // Case 6: Display library statistics
                case 6:
                    System.out.println("\n=== LIBRARY STATISTICS ===");
                    System.out.println("Total books in library : 6");

                    // Calculate total available copies across all books
                    int totalAvailable = book1.availableCopies+book2.availableCopies+book3.availableCopies+book4.availableCopies+book5.availableCopies+book6.availableCopies;
                    System.out.println("Total available copies "+ totalAvailable);

                    // Find most expensive book (highest pricePerDay)
                    LibraryBook highestPerDay = book1;

                    if (book2.pricePerDay>highestPerDay.pricePerDay){
                        highestPerDay = book2;
                    } if (book3.pricePerDay>highestPerDay.pricePerDay) {
                        highestPerDay=book3;
                    }  if (book4.pricePerDay>highestPerDay.pricePerDay) {
                        highestPerDay=book4;
                    }  if (book5.pricePerDay>highestPerDay.pricePerDay) {
                        highestPerDay=book5;
                    }  if (book6.pricePerDay>highestPerDay.pricePerDay) {
                        highestPerDay=book6;
                    }
                    System.out.println("Most expensive rental: " + highestPerDay.title +
                            " ($" + highestPerDay.pricePerDay + "/day)");

                    break;

                // Case 7: Exit program
                case 7:
                    System.out.println("Exiting");
                     running = false;
                    break;

                // Handle invalid menu choices
                default:
                    System.out.println("Invalid choice! Please try again.");

            }
        }

        sc.close(); // Close scanner
    }
}


