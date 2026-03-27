package library;

public class SpecialEditionDecorator extends BorrowDecorator {
    private String specialType;

    public SpecialEditionDecorator(BorrowOption wrappee, String specialType) {
        super(wrappee);
        this.specialType = specialType;
    }

    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + phien ban dac biet: " + specialType;
    }

    @Override
    public int getBorrowDays() {
        return wrappee.getBorrowDays();
    }
}