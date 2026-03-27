package observer.stock;

public class Investor implements StockObserver {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Nha dau tu " + name
                + " nhan thong bao: Co phieu "
                + stockName + " doi gia thanh " + price);
    }
}