package vn.edu.iuh.fit.payment;

public class PaymentContext {
    private final double originalAmount;
    private final PaymentStrategy paymentStrategy;
    private final PaymentComponent paymentComponent;
    private PaymentState state;

    public PaymentContext(double originalAmount,
                          PaymentStrategy paymentStrategy,
                          PaymentComponent paymentComponent) {
        this.originalAmount = originalAmount;
        this.paymentStrategy = paymentStrategy;
        this.paymentComponent = paymentComponent;
        this.state = new CreatedPaymentState();
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public PaymentComponent getPaymentComponent() {
        return paymentComponent;
    }

    public void setState(PaymentState state) {
        this.state = state;
    }

    public void process() {
        state.handle(this);
    }

    public String getCurrentState() {
        return state.name();
    }
}
