package library;

public abstract class BorrowDecorator implements BorrowOption {
    protected BorrowOption wrappee;

    public BorrowDecorator(BorrowOption wrappee) {
        this.wrappee = wrappee;
    }
}