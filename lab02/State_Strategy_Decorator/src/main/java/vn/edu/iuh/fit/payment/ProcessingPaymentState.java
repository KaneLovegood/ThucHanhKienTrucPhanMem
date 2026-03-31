package vn.edu.iuh.fit.payment;

public class ProcessingPaymentState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        System.out.println("- Trang thai: Dang xu ly thanh toan");
        double finalAmount = context.getPaymentComponent().finalAmount(context.getOriginalAmount());
        boolean success = context.getPaymentStrategy().pay(finalAmount);
        context.setState(success ? new CompletedPaymentState() : new FailedPaymentState());
        context.process();
    }

    @Override
    public String name() {
        return "DANG_XU_LY";
    }
}
