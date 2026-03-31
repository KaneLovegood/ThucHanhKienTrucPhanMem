package vn.edu.iuh.fit.order;

public class StrictValidationStrategy implements OrderValidationStrategy {
    @Override
    public boolean validate(OrderData orderData) {
        return orderData.getCustomerName() != null
                && orderData.getCustomerName().trim().split("\\s+").length >= 2
                && orderData.getTotalAmount() >= 100_000;
    }
}
