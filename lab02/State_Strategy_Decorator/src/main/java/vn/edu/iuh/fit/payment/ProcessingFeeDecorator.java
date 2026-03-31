package vn.edu.iuh.fit.payment;

public class ProcessingFeeDecorator extends PaymentDecorator {
    public ProcessingFeeDecorator(PaymentComponent wrappee) {
        super(wrappee);
    }

    @Override
    public double finalAmount(double originalAmount) {
        double amount = wrappee.finalAmount(originalAmount);
        return amount + amount * 0.03;
    }
}
