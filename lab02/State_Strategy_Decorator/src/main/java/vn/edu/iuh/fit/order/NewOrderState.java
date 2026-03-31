package vn.edu.iuh.fit.order;

public class NewOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("- Trang thai: Moi tao -> Kiem tra thong tin don hang");
        boolean isValid = context.getValidationStrategy().validate(context.getOrderData());
        if (isValid) {
            context.setState(new ProcessingOrderState());
            context.process();
        } else {
            context.setState(new CancelledOrderState());
            context.process();
        }
    }

    @Override
    public String name() {
        return "MOI_TAO";
    }
}
