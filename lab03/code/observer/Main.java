package observer;

public class Main {

    public static void main(String[] args) {

        Stock appleStock = new Stock("Apple", 150);

        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        appleStock.attach(investor1);
        appleStock.attach(investor2);

        appleStock.setPrice(155);
        appleStock.setPrice(160);
    }
}