package vn.edu.iuh.fit.order;

public interface OrderState {
    void handle(OrderContext context);
    String name();
}
