package library;

public class SubscriberObserver implements LibraryObserver {
    private String name;

    public SubscriberObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Nguoi dung " + name + " nhan thong bao: " + message);
    }
}