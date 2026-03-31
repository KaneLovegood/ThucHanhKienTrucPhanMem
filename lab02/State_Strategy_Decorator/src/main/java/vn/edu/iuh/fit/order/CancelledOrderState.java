package vn.edu.iuh.fit.order;

public class CancelledOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("- Trang thai: Huy -> Huy don va hoan tien");
    }

    @Override
    public String name() {
        return "HUY";
    }
}
