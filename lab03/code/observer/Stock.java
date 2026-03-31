package observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public Stock(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update("Stock " + stockName + " changed price to " + price);
        }
    }
}