package oops;

import oops.Librarian;
import oops.Library;



public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Create books
        Book book1 = new Book("1984", "George Orwell", "123456", 3);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "7891011", 2);

        // Create librarian
        Librarian librarian = new Librarian("Alice", "LIB001");

        // Add books to the library
        librarian.addBook(book1, library);
        librarian.addBook(book2, library);

        // Create members
        Member member1 = new Member("John Doe", "MEM001");
        Member member2 = new Member("Jane Smith", "MEM002");

        // Register members to the library
        library.registerMember(member1);
        library.registerMember(member2);

        // Member borrows books
        member1.borrowBook(book1);
        member1.borrowBook(book2);

        // Librarian views inventory
        librarian.viewInventory(library);

        // Member returns a book
        member1.returnBook(book1);

        // Librarian views inventory again
        librarian.viewInventory(library);

        // Member lists borrowed books
        member1.listBorrowedBooks();
    }
}
