package library;

import java.time.LocalDate;

public class BorrowRecord {
    private String userName;
    private Book book;
    private LocalDate borrowDate;
    private LocalDate dueDate;
    private String optionDescription;
    private boolean returned;

    public BorrowRecord(String userName, Book book, BorrowOption option) {
        this.userName = userName;
        this.book = book;
        this.borrowDate = LocalDate.now();
        this.dueDate = borrowDate.plusDays(option.getBorrowDays());
        this.optionDescription = option.getDescription();
        this.returned = false;
    }

    public String getUserName() {
        return userName;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void markReturned() {
        this.returned = true;
    }

    public boolean isOverdue(LocalDate currentDate) {
        return !returned && currentDate.isAfter(dueDate);
    }

    @Override
    public String toString() {
        return "User: " + userName
                + ", Book: " + book.getTitle()
                + ", Due: " + dueDate
                + ", Option: " + optionDescription
                + ", Returned: " + returned;
    }
}