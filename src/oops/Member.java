package oops;
import java.util.*;
class Member extends Person {
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        super(name, memberId);
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is currently unavailable.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            book.returnBook();
            borrowedBooks.remove(book);
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow this book.");
        }
    }

    public void listBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed books.");
        } else {
            System.out.println(name + "'s borrowed books:");
            for (Book book : borrowedBooks) {
                System.out.println(book.getDetails());
            }
        }
    }

    @Override
    public String getDetails() {
        return "Member Name: " + name + ", Member ID: " + memberId;
    }
}