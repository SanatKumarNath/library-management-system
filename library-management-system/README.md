# Library Management System

A console-based library management system built in Java to practice Object-Oriented Programming concepts.

## Description

This project is a fully functional library management system that allows users to manage a collection of books through an interactive menu-driven interface. The system handles book inventory, borrowing, returning, and provides analytics on library usage.

## Features

- **Search Books by Category**: Find all books in a specific category (Fiction, Science, History, Non-Fiction)
- **Borrow Books**: Check out available copies with automatic inventory updates
- **Return Books**: Return borrowed books with validation
- **Calculate Rental Cost**: Compute total rental fees based on duration and quantity
- **Most Popular Book**: Identify the most borrowed book based on availability ratio
- **Library Statistics**: View total inventory, available copies, and pricing information

## Technologies Used

- Java
- Object-Oriented Programming principles
- Scanner for user input
- Menu-driven architecture

## OOP Concepts Demonstrated

- **Classes and Objects**: LibraryBook class with multiple instances
- **Encapsulation**: Book properties with controlled access through methods
- **Methods**: borrowBook(), returnBook(), calculateRentalCost(), display()
- **Constructors**: Initialize book objects with all required data
- **Boolean Return Values**: For validation and success/failure handling

## How to Run

1. Clone the repository
```bash

git clone https://github.com/SanatKumarNathlibrary-management-system.git

## 2. Navigate to the project directory
```bash
cd library-management-system

## 3. Compile the Java files
```bash
javac librarymanagement/LibraryBook.java librarymanagement/Main.java

## 4. Run the program
```bash
java librarymanagement.Main
## Usage Example
==MENU==
1. Search books by category
2. Borrow a book
3. Return a book
4. Calculate rental cost
5. Show most popular book
6. Show library statistics
7. Exit

Enter your choice: 2
Enter book title you want to borrow: 1984
How many copies do you want? 2
Success! 2 copies borrowed.
Remaining copies: 4

## Project Structure
library-management-system/
│
├── librarymanagement/
│   ├── LibraryBook.java    # Book class with properties and methods
│   └── Main.java            # Main program with menu system
│
└── README.md
## What I Learned

Search Pattern: Implemented the "find first, then process" pattern for efficient book searching
Menu Systems: Created a looping menu with switch-case structure
Input Handling: Managed Scanner buffer issues with nextInt() and nextLine()
Comparison Algorithms: Finding maximum/minimum values in object collections
Validation Logic: Ensuring data integrity during borrow/return operations
Ratio Calculations: Determining popularity based on availability metrics

## Challenges Overcome
1. Scanner buffer management between nextInt() and nextLine()
2. Implementing the search pattern to avoid code repetition
3. Calculating book popularity using availability ratios
4. Validating return operations to prevent exceeding total copies

## Future Enhancements

Add user authentication system
Implement persistent storage (file I/O or database)
Add due dates and late fee calculation
Create a graphical user interface
Support for multiple users and reservation system

Author
Sanat
Acknowledgments
Built as a learning project to practice Java OOP fundamentals and problem-solving patterns.
License
This project is open source and available for educational purposes.

