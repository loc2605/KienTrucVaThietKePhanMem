package library;

public class AudioBookFactory extends BookFactory {
    @Override
    public Book createBook(String id, String title, String author, String genre) {
        return new AudioBook(id, title, author, genre);
    }
}