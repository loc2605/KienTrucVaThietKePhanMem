package library;

public class ExtendBorrowDecorator extends BorrowDecorator {
    private int extraDays;

    public ExtendBorrowDecorator(BorrowOption wrappee, int extraDays) {
        super(wrappee);
        this.extraDays = extraDays;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + gia han " + extraDays + " ngay";
    }

    @Override
    public int getBorrowDays() {
        return wrappee.getBorrowDays() + extraDays;
    }
}