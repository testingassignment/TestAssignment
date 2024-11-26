package oops;

public class Librarian extends Person {

    public Librarian(String name, String employeeId) {
        super(name, employeeId);
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println(name + " added: " + book.getTitle());
    }

    public void removeBook(Book book, Library library) {
        library.removeBook(book);
        System.out.println(name + " removed: " + book.getTitle());
    }

    public void viewInventory(Library library) {
        System.out.println(name + "'s inventory view:");
        library.listAllBooks();
    }

    @Override
    public String getDetails() {
        return "Librarian Name: " + name + ", Employee ID: " + memberId;
    }
}