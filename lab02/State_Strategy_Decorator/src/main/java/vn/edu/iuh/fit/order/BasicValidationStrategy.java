package vn.edu.iuh.fit.order;

public class BasicValidationStrategy implements OrderValidationStrategy {
    @Override
    public boolean validate(OrderData orderData) {
        return orderData.getCustomerName() != null
                && !orderData.getCustomerName().isBlank()
                && orderData.getTotalAmount() > 0;
    }
}
