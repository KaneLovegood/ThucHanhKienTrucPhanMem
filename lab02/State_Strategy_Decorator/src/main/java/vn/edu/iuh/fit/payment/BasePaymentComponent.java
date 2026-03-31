package vn.edu.iuh.fit.payment;

public class BasePaymentComponent implements PaymentComponent {
    @Override
    public double finalAmount(double originalAmount) {
        return originalAmount;
    }
}
