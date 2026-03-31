package vn.edu.iuh.fit.order;

public interface OrderValidationStrategy {
    boolean validate(OrderData orderData);
}
