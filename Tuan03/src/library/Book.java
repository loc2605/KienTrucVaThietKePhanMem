package library;

public abstract class Book {
    protected String id;
    protected String title;
    protected String author;
    protected String genre;
    protected boolean available;

    public Book(String id, String title, String author, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "[" + getType() + "] " + title + " - " + author + " - " + genre
                + " - " + (available ? "Available" : "Borrowed");
    }
}