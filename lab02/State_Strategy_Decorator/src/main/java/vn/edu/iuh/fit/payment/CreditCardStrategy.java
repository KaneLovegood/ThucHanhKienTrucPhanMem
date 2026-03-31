package vn.edu.iuh.fit.payment;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.printf("  [Strategy] Thanh toan the tin dung: %.0f VND%n", amount);
        return amount <= 5_000_000;
    }

    @Override
    public String name() {
        return "CreditCard";
    }
}
