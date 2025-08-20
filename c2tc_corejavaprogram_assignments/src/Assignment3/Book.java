package Assignment3;

public class Book extends Item {
    String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public void display() {
        System.out.println("- " + title + " by " + author);
    }

    @Override
    public String toString() {
        return "Book: [ID: " + id + ", Title: " + title + ", Author: " + author + "]";
    }
}
