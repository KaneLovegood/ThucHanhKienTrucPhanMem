package vn.edu.iuh.fit.order;

public class DeliveredOrderState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("- Trang thai: Da giao -> Cap nhat da giao thanh cong");
    }

    @Override
    public String name() {
        return "DA_GIAO";
    }
}
