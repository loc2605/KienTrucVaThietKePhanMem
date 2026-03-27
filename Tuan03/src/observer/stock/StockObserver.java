package observer.stock;

public interface StockObserver {
    void update(String stockName, double price);
}