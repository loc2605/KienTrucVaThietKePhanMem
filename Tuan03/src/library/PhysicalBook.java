package library;

public class PhysicalBook extends Book {
    public PhysicalBook(String id, String title, String author, String genre) {
        super(id, title, author, genre);
    }

    @Override
    public String getType() {
        return "Physical Book";
    }
}