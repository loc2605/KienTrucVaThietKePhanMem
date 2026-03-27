package library;

public class AudioBook extends Book {
    public AudioBook(String id, String title, String author, String genre) {
        super(id, title, author, genre);
    }

    @Override
    public String getType() {
        return "Audio Book";
    }
}