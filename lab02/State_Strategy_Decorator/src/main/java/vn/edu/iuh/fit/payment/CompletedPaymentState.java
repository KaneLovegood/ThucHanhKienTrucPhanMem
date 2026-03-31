package vn.edu.iuh.fit.payment;

public class CompletedPaymentState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        System.out.println("- Trang thai: Thanh toan thanh cong");
    }

    @Override
    public String name() {
        return "THANH_CONG";
    }
}
