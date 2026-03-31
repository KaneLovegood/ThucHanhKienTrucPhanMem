package vn.edu.iuh.fit.order;

public class OrderData {
    private final String orderId;
    private final String customerName;
    private final double totalAmount;

    public OrderData(String orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}
