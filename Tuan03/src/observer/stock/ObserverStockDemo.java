package observer.stock;

public class ObserverStockDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("FPT", 100.0);

        Investor investor1 = new Investor("An");
        Investor investor2 = new Investor("Binh");

        stock.registerObserver(investor1);
        stock.registerObserver(investor2);

        stock.setPrice(110.5);
        stock.setPrice(120.0);
    }
}