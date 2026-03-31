package vn.edu.iuh.fit.payment;

public class CreatedPaymentState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        System.out.println("- Trang thai: Khoi tao giao dich");
        context.setState(new ProcessingPaymentState());
        context.process();
    }

    @Override
    public String name() {
        return "KHOI_TAO";
    }
}
