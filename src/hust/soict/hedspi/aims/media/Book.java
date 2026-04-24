package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media {

    private ArrayList<String> authors = new ArrayList<>();
    private String content;

    public Book(int id, String title, String category, float cost, String content) {
        super(id, title, category, cost);
        this.content = content;
    }

    public void addAuthor(String author) {
        if (author == null) return;

        if (!authors.contains(author)) {
            authors.add(author);
        }
    }

    public void removeAuthor(String author) {
        if (author == null) return;

        authors.remove(author);
    }

    public int getContentLength() {
        if (content == null || content.isEmpty()) return 0;
        return content.split("\\s+").length;
    }

    public void displayInfo() {
        System.out.println("BOOK");
        System.out.println("Title: " + getTitle());
        System.out.println("Category: " + getCategory());
        System.out.println("Authors: " + authors);
        System.out.println("Content length: " + getContentLength());
        System.out.println("Cost: " + getCost());
    }
}