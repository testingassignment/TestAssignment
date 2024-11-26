package oops;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;
    private Map<String, Member> members;

    public Library() {
        this.books = new HashMap<>();
        this.members = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(Book book) {
        books.remove(book.getIsbn());
    }

    public void registerMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void issueBook(String memberId, String bookIsbn) {
        Member member = members.get(memberId);
        Book book = books.get(bookIsbn);

        if (member != null && book != null) {
            member.borrowBook(book);
        } else {
            System.out.println("Either the member or the book was not found.");
        }
    }

    public void receiveBook(String memberId, String bookIsbn) {
        Member member = members.get(memberId);
        Book book = books.get(bookIsbn);

        if (member != null && book != null) {
            member.returnBook(book);
        } else {
            System.out.println("Either the member or the book was not found.");
        }
    }

    public void listAllBooks() {
        for (Book book : books.values()) {
            System.out.println(book.getDetails());
        }
    }

    public Book getBookByIsbn(String isbn) {
        return books.get(isbn);
    }
}
