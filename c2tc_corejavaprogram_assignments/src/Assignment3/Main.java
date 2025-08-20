package Assignment3;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding items
        Book book1 = new Book(101, "Java Basics", "James Gosling");
        Magazine mag1 = new Magazine(201, "Tech Today", 45);

        library.addItem(book1);
        library.addItem(mag1);

        // Display all items in library
        library.showAllItems();
    }
}
