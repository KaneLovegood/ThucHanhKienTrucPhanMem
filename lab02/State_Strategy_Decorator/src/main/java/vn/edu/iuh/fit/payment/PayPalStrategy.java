package vn.edu.iuh.fit.payment;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public boolean pay(double amount) {
        System.out.printf("  [Strategy] Thanh toan PayPal: %.0f VND%n", amount);
        return true;
    }

    @Override
    public String name() {
        return "PayPal";
    }
}
