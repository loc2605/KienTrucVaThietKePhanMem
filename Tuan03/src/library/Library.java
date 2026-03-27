package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library instance;

    private List<Book> books;
    private List<LibraryObserver> observers;
    private List<BorrowRecord> records;

    private Library() {
        books = new ArrayList<>();
        observers = new ArrayList<>();
        records = new ArrayList<>();
    }

    public static synchronized Library getInstance() {
        if (instance == null) {
            instance = new Library();
        }
        return instance;
    }

    public void addObserver(LibraryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(LibraryObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(String message) {
        for (LibraryObserver observer : observers) {
            observer.update(message);
        }
    }

    public void addBook(Book book) {
        books.add(book);
        notifyObservers("Co sach moi duoc them vao thu vien: " + book.getTitle());
    }

    public List<Book> viewAvailableBooks() {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchBooks(SearchStrategy strategy, String keyword) {
        return strategy.search(books, keyword);
    }

    public BorrowRecord borrowBook(String userName, String bookId, BorrowOption option) {
        for (Book book : books) {
            if (book.getId().equals(bookId) && book.isAvailable()) {
                book.setAvailable(false);
                BorrowRecord record = new BorrowRecord(userName, book, option);
                records.add(record);

                System.out.println(userName + " da muon sach: " + book.getTitle());
                System.out.println("Tuy chon muon: " + option.getDescription());

                return record;
            }
        }
        System.out.println("Khong the muon sach. Sach khong ton tai hoac da duoc muon.");
        return null;
    }

    public void returnBook(String bookId) {
        for (BorrowRecord record : records) {
            if (record.getBook().getId().equals(bookId) && !record.isReturned()) {
                record.markReturned();
                record.getBook().setAvailable(true);
                System.out.println("Da tra sach: " + record.getBook().getTitle());
                return;
            }
        }
        System.out.println("Khong tim thay ban ghi muon hop le.");
    }

    public void checkOverdueBooks() {
        LocalDate today = LocalDate.now();
        for (BorrowRecord record : records) {
            if (record.isOverdue(today)) {
                notifyObservers("Sach qua han: " + record.getBook().getTitle()
                        + " - Nguoi muon: " + record.getUserName());
            }
        }
    }

    public void showAllBooks() {
        System.out.println("=== Danh sach sach ===");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void showAllBorrowRecords() {
        System.out.println("=== Danh sach muon ===");
        for (BorrowRecord record : records) {
            System.out.println(record);
        }
    }
}