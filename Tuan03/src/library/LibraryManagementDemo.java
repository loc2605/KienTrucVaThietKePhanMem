package library;

import java.util.List;

public class LibraryManagementDemo {
    public static void main(String[] args) {
        Library library = Library.getInstance();

        // Observer
        library.addObserver(new LibrarianObserver("Lan"));
        library.addObserver(new SubscriberObserver("Minh"));

        // Factory Method
        BookFactory physicalFactory = new PhysicalBookFactory();
        BookFactory ebookFactory = new EBookFactory();
        BookFactory audioFactory = new AudioBookFactory();

        library.addBook(physicalFactory.createBook("B01", "Lap trinh Java", "Nguyen Van A", "CNTT"));
        library.addBook(ebookFactory.createBook("B02", "Design Pattern", "Erich Gamma", "CNTT"));
        library.addBook(audioFactory.createBook("B03", "De Men Phieu Luu Ky", "To Hoai", "Van hoc"));

        library.showAllBooks();

        System.out.println("\n=== Tim theo ten ===");
        List<Book> result1 = library.searchBooks(new SearchByTitleStrategy(), "Java");
        for (Book b : result1) {
            System.out.println(b);
        }

        System.out.println("\n=== Tim theo tac gia ===");
        List<Book> result2 = library.searchBooks(new SearchByAuthorStrategy(), "To Hoai");
        for (Book b : result2) {
            System.out.println(b);
        }

        System.out.println("\n=== Tim theo the loai ===");
        List<Book> result3 = library.searchBooks(new SearchByGenreStrategy(), "CNTT");
        for (Book b : result3) {
            System.out.println(b);
        }

        // Decorator
        BorrowOption option = new StandardBorrow();
        option = new ExtendBorrowDecorator(option, 5);
        option = new SpecialEditionDecorator(option, "Chu noi Braille");

        library.borrowBook("An", "B03", option);

        library.showAllBorrowRecords();

        library.returnBook("B03");

        library.showAllBooks();

        library.checkOverdueBooks();
    }
}