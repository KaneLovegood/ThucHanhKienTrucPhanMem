package vn.edu.iuh.fit.payment;

public class FailedPaymentState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        System.out.println("- Trang thai: Thanh toan that bai");
    }

    @Override
    public String name() {
        return "THAT_BAI";
    }
}
