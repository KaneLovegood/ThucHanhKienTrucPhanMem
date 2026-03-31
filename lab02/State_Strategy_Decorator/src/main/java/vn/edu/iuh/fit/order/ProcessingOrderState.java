package vn.edu.iuh.fit.order;

public class ProcessingOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("- Trang thai: Dang xu ly -> Dong goi va van chuyen");
        context.getOrderAction().execute(context.getOrderData());
        context.setState(new DeliveredOrderState());
        context.process();
    }

    @Override
    public String name() {
        return "DANG_XU_LY";
    }
}
