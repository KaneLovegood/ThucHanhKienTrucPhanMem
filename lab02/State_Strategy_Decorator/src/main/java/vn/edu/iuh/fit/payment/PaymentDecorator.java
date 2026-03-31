package vn.edu.iuh.fit.payment;

public abstract class PaymentDecorator implements PaymentComponent {
    protected final PaymentComponent wrappee;

    protected PaymentDecorator(PaymentComponent wrappee) {
        this.wrappee = wrappee;
    }
}
