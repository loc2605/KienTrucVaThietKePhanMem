package library;

public class LibrarianObserver implements LibraryObserver {
    private String name;

    public LibrarianObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Thu thu " + name + " nhan thong bao: " + message);
    }
}