package library;

public class EBook extends Book {
    public EBook(String id, String title, String author, String genre) {
        super(id, title, author, genre);
    }

    @Override
    public String getType() {
        return "E-Book";
    }
}