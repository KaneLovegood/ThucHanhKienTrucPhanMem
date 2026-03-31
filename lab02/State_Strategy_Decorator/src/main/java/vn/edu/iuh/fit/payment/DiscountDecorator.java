package vn.edu.iuh.fit.payment;

public class DiscountDecorator extends PaymentDecorator {
    public DiscountDecorator(PaymentComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double finalAmount(double originalAmount) {
        double amount = wrappee.finalAmount(originalAmount);
        return amount - amount * 0.10;
    }
}
