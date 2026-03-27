package library;

public class StandardBorrow implements BorrowOption {
    @Override
    public String getDescription() {
        return "Muon tieu chuan";
    }

    @Override
    public int getBorrowDays() {
        return 7;
    }
}