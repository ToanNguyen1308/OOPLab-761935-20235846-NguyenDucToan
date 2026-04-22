package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<>();
    private static int nbBooks = 0;

    // Constructor: title + author
    public Book(String title, String author) {
        super(++nbBooks, title, "", 0.0f);
        this.authors.add(author);
    }

    // Constructor: title + category + author
    public Book(String title, String category, String author) {
        super(++nbBooks, title, category, 0.0f);
        this.authors.add(author);
    }

    // Constructor: title + category + cost + author
    public Book(String title, String category, float cost, String author) {
        super(++nbBooks, title, category, cost);
        this.authors.add(author);
    }

    // Constructor: title + category + cost + multiple authors
    public Book(String title, String category, float cost, ArrayList<String> authors) {
        super(++nbBooks, title, category, cost);
        this.authors.addAll(authors);
    }

    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author already exists.");
        }
    }

    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author not found.");
        }
    }

    @Override
    public String toString() {
        return this.getId() + ". Book - " + getTitle() + " - " + getCategory() + " - " + authors + ": " + getCost() + " $";
    }
}
