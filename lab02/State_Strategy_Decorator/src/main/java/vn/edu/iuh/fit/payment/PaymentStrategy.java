package vn.edu.iuh.fit.payment;

public interface PaymentStrategy {
    boolean pay(double amount);
    String name();
}
