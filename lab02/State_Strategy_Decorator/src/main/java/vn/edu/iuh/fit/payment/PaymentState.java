package vn.edu.iuh.fit.payment;

public interface PaymentState {
    void handle(PaymentContext context);
    String name();
}
