package ee.ivkhkdev;

import ee.ivkhkdev.Author;

public class Book {
    private String title;
    private Author[] authors;

    public Book(String title, Author[] authors) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Book title cant be empty");
        }
        if (authors == null || authors.length == 0) {
            throw new IllegalArgumentException("Book must have at least one author");
        }
        this.title = title;
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Book title cant be empty");
        }
        this.title = title;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        if (authors == null || authors.length == 0) {
            throw new IllegalArgumentException("Book must have at least one author");
        }
        this.authors = authors;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append(" by ");
        for (int i = 0; i < authors.length; i++) {
            sb.append(authors[i].getName());
            if (i < authors.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}
