package library;

public class EBookFactory extends BookFactory {
    @Override
    public Book createBook(String id, String title, String author, String genre) {
        return new EBook(id, title, author, genre);
    }
}