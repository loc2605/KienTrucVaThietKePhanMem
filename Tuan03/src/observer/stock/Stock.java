package observer.stock;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StockSubject {
    private String stockName;
    private double price;
    private List<StockObserver> observers;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        this.observers = new ArrayList<>();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(StockObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(stockName, price);
        }
    }
}