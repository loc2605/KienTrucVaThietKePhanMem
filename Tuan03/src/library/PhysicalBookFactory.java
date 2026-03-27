package library;

public class PhysicalBookFactory extends BookFactory {
    @Override
    public Book createBook(String id, String title, String author, String genre) {
        return new PhysicalBook(id, title, author, genre);
    }
}